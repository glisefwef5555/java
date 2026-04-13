import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class StandardDFD {
    public static void main(String[] args) {
        try {
            int width = 900;
            int height = 600;
            BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = image.createGraphics();
            
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, width, height);
            g.setColor(Color.BLACK);
            g.setFont(new Font("宋体", Font.PLAIN, 15));

            // ===================== 标准答案 DFD 开始 =====================
            // 外部实体：学生
            drawRect(g, 50, 200, "学生");

            // P1 审查购书单
            drawCircleRect(g, 220, 150, "P1 审查购书单");
            drawArrow(g, 130, 220, 220, 170);
            g.drawString("购书单", 150, 200);

            // P2 登记缺书
            drawCircleRect(g, 220, 270, "P2 登记缺书");
            drawArrow(g, 280, 170, 280, 270);
            g.drawString("有效购书", 290, 210);

            // D1 缺书登记表
            drawStore(g, 350, 270, "D1 缺书登记表");
            drawArrow(g, 340, 290, 350, 290);

            // P3 开领书单
            drawCircleRect(g, 420, 150, "P3 开领书单");
            drawArrow(g, 280, 150, 420, 150);
            drawArrow(g, 480, 170, 480, 220);
            g.drawString("领书单", 490, 190);

            // D2 教材库存
            drawStore(g, 350, 80, "D2 教材库存");
            drawArrow(g, 410, 110, 420, 150);
            drawArrow(g, 350, 110, 280, 110);

            // P4 汇总缺书
            drawCircleRect(g, 550, 270, "P4 汇总缺书");
            drawArrow(g, 450, 290, 550, 290);

            // P5 处理采购
            drawCircleRect(g, 680, 270, "P5 处理采购");
            drawArrow(g, 610, 290, 680, 290);
            drawArrow(g, 750, 290, 750, 110);
            g.drawString("进书通知", 760, 180);

            // 箭头
            drawArrow(g, 480, 220, 130, 220);
            // ===================== 标准答案 DFD 结束 =====================

            g.dispose();
            ImageIO.write(image, "png", new File("dfd_standard.png"));
            System.out.println("✅ 标准答案已生成：dfd_standard.png");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 外部实体
    private static void drawRect(Graphics2D g, int x, int y, String t) {
        g.drawRect(x, y, 120, 40);
        g.drawString(t, x+25, y+25);
    }

    // 加工处理
    private static void drawCircleRect(Graphics2D g, int x, int y, String t) {
        g.drawRoundRect(x, y, 120, 40, 15,15);
        g.drawString(t, x+10, y+25);
    }

    // 数据存储
    private static void drawStore(Graphics2D g, int x, int y, String t) {
        g.drawRect(x, y, 120, 40);
        g.drawLine(x+5, y+20, x+115, y+20);
        g.drawString(t, x+10, y+55);
    }

    // 箭头
    private static void drawArrow(Graphics2D g, int x1,int y1,int x2,int y2) {
        g.drawLine(x1,y1,x2,y2);
    }
}