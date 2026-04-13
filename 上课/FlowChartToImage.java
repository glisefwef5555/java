import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class FlowChartToImage {
    public static void main(String[] args) {
        int width = 800;
        int height = 900;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = image.createGraphics();
        
        // 抗锯齿优化
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // 背景白色
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);
        // 线条黑色
        g.setColor(Color.BLACK);
        // 字体：兼容Windows/Mac/Linux，优先微软雅黑， fallback 宋体/黑体
        Font font = new Font("微软雅黑", Font.PLAIN, 14);
        if (!font.getFamily().equals("微软雅黑")) {
            font = new Font("宋体", Font.PLAIN, 14);
        }
        g.setFont(font);

        try {
            // 1. 开始椭圆
            drawOval(g, 350, 30, "开始");
            drawArrow(g, 380, 60, 380, 90);

            // 2. 输入输出：用户注册/登录
            drawParallelogram(g, 320, 100, "用户注册/登录");
            drawArrow(g, 380, 140, 380, 170);

            // 3. 处理：商品浏览/下单
            drawRect(g, 320, 180, "商品浏览/下单");
            drawArrow(g, 380, 220, 380, 250);

            // 4. 判断：发起支付？
            drawDiamond(g, 320, 260, "发起支付？");
            // 成功分支
            drawArrow(g, 320, 300, 220, 300);
            g.drawString("成功", 230, 295);
            // 超时分支
            drawArrow(g, 440, 300, 520, 300);
            g.drawString("超时", 460, 295);

            // 5. 成功 → 生成订单
            drawRect(g, 180, 320, "生成订单");
            drawArrow(g, 220, 360, 220, 390);

            // 6. 超时 → 取消订单 → 退款 → 结束
            drawRect(g, 520, 320, "取消订单");
            drawArrow(g, 560, 360, 560, 390);
            drawParallelogram(g, 520, 400, "退款");
            drawArrow(g, 560, 440, 560, 470);
            drawOval(g, 520, 480, "结束");

            // 7. 订单 → 商家备货
            drawRect(g, 180, 400, "商家备货");
            drawArrow(g, 220, 440, 220, 470);

            // 8. 判断：是否缺货？
            drawDiamond(g, 180, 480, "是否缺货？");
            drawArrow(g, 140, 520, 100, 520);
            g.drawString("是", 110, 515);
            drawArrow(g, 300, 520, 340, 520);
            g.drawString("否", 320, 515);

            // 9. 缺货 → 通知用户 → 退款/补货
            drawParallelogram(g, 40, 540, "通知用户");
            drawDiamond(g, 40, 580, "退款/补货");

            // 10. 不缺货 → 骑手配送
            drawRect(g, 360, 540, "骑手配送");
            drawArrow(g, 400, 580, 400, 610);
            drawParallelogram(g, 360, 620, "到货提醒");
            drawArrow(g, 400, 660, 400, 690);

            // 11. 判断：用户取货？
            drawDiamond(g, 360, 700, "用户取货？");
            drawArrow(g, 320, 740, 280, 740);
            g.drawString("是", 290, 735);
            drawArrow(g, 440, 740, 480, 740);
            g.drawString("否", 450, 735);

            // 12. 取货 → 确认 → 结束
            drawRect(g, 240, 760, "确认取货");
            drawArrow(g, 280, 800, 280, 830);
            drawOval(g, 240, 840, "结束");

            // 13. 未取货 → 超期提醒
            drawParallelogram(g, 480, 760, "超期提醒");

            // 释放资源
            g.dispose();

            // 生成图片：指定绝对路径，避免找不到文件
            String outputPath = "D:\\java BYQ\\flowchart.png";
            File outputFile = new File(outputPath);
            ImageIO.write(image, "png", outputFile);
            System.out.println("✅ 图片生成成功！路径：" + outputPath);

        } catch (Exception e) {
            // 捕获所有异常，打印错误信息
            System.err.println("❌ 生成图片失败，错误信息：");
            e.printStackTrace();
        }
    }

    // 绘制矩形（处理过程）
    private static void drawRect(Graphics2D g, int x, int y, String text) {
        g.drawRect(x, y, 120, 40);
        g.drawString(text, x + 10, y + 25);
    }

    // 绘制椭圆（开始/结束）
    private static void drawOval(Graphics2D g, int x, int y, String text) {
        g.drawOval(x, y, 120, 40);
        g.drawString(text, x + 30, y + 25);
    }

    // 绘制菱形（判断分支）
    private static void drawDiamond(Graphics2D g, int x, int y, String text) {
        Polygon p = new Polygon();
        p.addPoint(x + 60, y);
        p.addPoint(x + 120, y + 20);
        p.addPoint(x + 60, y + 40);
        p.addPoint(x, y + 20);
        g.drawPolygon(p);
        g.drawString(text, x + 10, y + 25);
    }

    // 绘制平行四边形（输入/输出）
    private static void drawParallelogram(Graphics2D g, int x, int y, String text) {
        Polygon p = new Polygon();
        p.addPoint(x + 15, y);
        p.addPoint(x + 120, y);
        p.addPoint(x + 105, y + 40);
        p.addPoint(x, y + 40);
        g.drawPolygon(p);
        g.drawString(text, x + 10, y + 25);
    }

    // 绘制带箭头的连线
    private static void drawArrow(Graphics2D g, int x1, int y1, int x2, int y2) {
        g.drawLine(x1, y1, x2, y2);
        double angle = Math.atan2(y2 - y1, x2 - x1);
        int arrowSize = 8;
        // 箭头两个边
        int x3 = x2 - (int) (arrowSize * Math.cos(angle - Math.PI / 6));
        int y3 = y2 - (int) (arrowSize * Math.sin(angle - Math.PI / 6));
        int x4 = x2 - (int) (arrowSize * Math.cos(angle + Math.PI / 6));
        int y4 = y2 - (int) (arrowSize * Math.sin(angle + Math.PI / 6));
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x2, y2, x4, y4);
    }
}