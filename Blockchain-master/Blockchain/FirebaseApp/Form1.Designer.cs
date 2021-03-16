namespace FirebaseApp
{
    partial class Form1
    {
        /// <summary>
        /// Variável de designer necessária.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpar os recursos que estão sendo usados.
        /// </summary>
        /// <param name="disposing">true se for necessário descartar os recursos gerenciados; caso contrário, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código gerado pelo Windows Form Designer

        /// <summary>
        /// Método necessário para suporte ao Designer - não modifique 
        /// o conteúdo deste método com o editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.label2 = new System.Windows.Forms.Label();
            this.panel1 = new System.Windows.Forms.Panel();
            this.buttonADD = new System.Windows.Forms.Button();
            this.label5 = new System.Windows.Forms.Label();
            this.textCidadeAd = new System.Windows.Forms.TextBox();
            this.textNomeAd = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.panel2 = new System.Windows.Forms.Panel();
            this.lbl_hash_atual = new System.Windows.Forms.Label();
            this.label19 = new System.Windows.Forms.Label();
            this.lbl_data = new System.Windows.Forms.Label();
            this.lbl_hashAnterior = new System.Windows.Forms.Label();
            this.lbl_valor = new System.Windows.Forms.Label();
            this.lbl_vandedor = new System.Windows.Forms.Label();
            this.lbl_Comprador = new System.Windows.Forms.Label();
            this.lbl_hash = new System.Windows.Forms.Label();
            this.label12 = new System.Windows.Forms.Label();
            this.label11 = new System.Windows.Forms.Label();
            this.label10 = new System.Windows.Forms.Label();
            this.label9 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.buttonEdit = new System.Windows.Forms.Button();
            this.label6 = new System.Windows.Forms.Label();
            this.panel3 = new System.Windows.Forms.Panel();
            this.btnConect = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.textNameConect = new System.Windows.Forms.TextBox();
            this.label7 = new System.Windows.Forms.Label();
            this.panel1.SuspendLayout();
            this.panel2.SuspendLayout();
            this.panel3.SuspendLayout();
            this.SuspendLayout();
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(3, 29);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(35, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "Nome";
            // 
            // panel1
            // 
            this.panel1.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.panel1.Controls.Add(this.buttonADD);
            this.panel1.Controls.Add(this.label5);
            this.panel1.Controls.Add(this.textCidadeAd);
            this.panel1.Controls.Add(this.textNomeAd);
            this.panel1.Controls.Add(this.label3);
            this.panel1.Controls.Add(this.label2);
            this.panel1.Location = new System.Drawing.Point(161, 12);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(118, 172);
            this.panel1.TabIndex = 2;
            // 
            // buttonADD
            // 
            this.buttonADD.Enabled = false;
            this.buttonADD.Location = new System.Drawing.Point(3, 141);
            this.buttonADD.Name = "buttonADD";
            this.buttonADD.Size = new System.Drawing.Size(110, 23);
            this.buttonADD.TabIndex = 9;
            this.buttonADD.Text = "Mandar Proposta";
            this.buttonADD.UseVisualStyleBackColor = true;
            this.buttonADD.Click += new System.EventHandler(this.buttonADD_ClickAsync);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(16, 10);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(75, 13);
            this.label5.TabIndex = 8;
            this.label5.Text = "Comprar de:";
            // 
            // textCidadeAd
            // 
            this.textCidadeAd.Enabled = false;
            this.textCidadeAd.Location = new System.Drawing.Point(6, 102);
            this.textCidadeAd.Name = "textCidadeAd";
            this.textCidadeAd.Size = new System.Drawing.Size(100, 20);
            this.textCidadeAd.TabIndex = 6;
            // 
            // textNomeAd
            // 
            this.textNomeAd.Enabled = false;
            this.textNomeAd.Location = new System.Drawing.Point(6, 45);
            this.textNomeAd.Name = "textNomeAd";
            this.textNomeAd.Size = new System.Drawing.Size(100, 20);
            this.textNomeAd.TabIndex = 5;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(3, 86);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(31, 13);
            this.label3.TabIndex = 2;
            this.label3.Text = "Valor";
            // 
            // panel2
            // 
            this.panel2.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.panel2.Controls.Add(this.lbl_hash_atual);
            this.panel2.Controls.Add(this.label19);
            this.panel2.Controls.Add(this.lbl_data);
            this.panel2.Controls.Add(this.lbl_hashAnterior);
            this.panel2.Controls.Add(this.lbl_valor);
            this.panel2.Controls.Add(this.lbl_vandedor);
            this.panel2.Controls.Add(this.lbl_Comprador);
            this.panel2.Controls.Add(this.lbl_hash);
            this.panel2.Controls.Add(this.label12);
            this.panel2.Controls.Add(this.label11);
            this.panel2.Controls.Add(this.label10);
            this.panel2.Controls.Add(this.label9);
            this.panel2.Controls.Add(this.label8);
            this.panel2.Controls.Add(this.label4);
            this.panel2.Controls.Add(this.buttonEdit);
            this.panel2.Controls.Add(this.label6);
            this.panel2.Location = new System.Drawing.Point(285, 12);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(390, 221);
            this.panel2.TabIndex = 10;
            // 
            // lbl_hash_atual
            // 
            this.lbl_hash_atual.AutoSize = true;
            this.lbl_hash_atual.Location = new System.Drawing.Point(3, 146);
            this.lbl_hash_atual.Name = "lbl_hash_atual";
            this.lbl_hash_atual.Size = new System.Drawing.Size(0, 13);
            this.lbl_hash_atual.TabIndex = 23;
            // 
            // label19
            // 
            this.label19.AutoSize = true;
            this.label19.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label19.Location = new System.Drawing.Point(3, 131);
            this.label19.Name = "label19";
            this.label19.Size = new System.Drawing.Size(69, 13);
            this.label19.TabIndex = 22;
            this.label19.Text = "Hash Atual";
            // 
            // lbl_data
            // 
            this.lbl_data.AutoSize = true;
            this.lbl_data.Location = new System.Drawing.Point(118, 105);
            this.lbl_data.Name = "lbl_data";
            this.lbl_data.Size = new System.Drawing.Size(0, 13);
            this.lbl_data.TabIndex = 21;
            // 
            // lbl_hashAnterior
            // 
            this.lbl_hashAnterior.AutoSize = true;
            this.lbl_hashAnterior.Location = new System.Drawing.Point(118, 89);
            this.lbl_hashAnterior.Name = "lbl_hashAnterior";
            this.lbl_hashAnterior.Size = new System.Drawing.Size(0, 13);
            this.lbl_hashAnterior.TabIndex = 20;
            // 
            // lbl_valor
            // 
            this.lbl_valor.AutoSize = true;
            this.lbl_valor.Location = new System.Drawing.Point(118, 76);
            this.lbl_valor.Name = "lbl_valor";
            this.lbl_valor.Size = new System.Drawing.Size(0, 13);
            this.lbl_valor.TabIndex = 19;
            // 
            // lbl_vandedor
            // 
            this.lbl_vandedor.AutoSize = true;
            this.lbl_vandedor.Location = new System.Drawing.Point(118, 61);
            this.lbl_vandedor.Name = "lbl_vandedor";
            this.lbl_vandedor.Size = new System.Drawing.Size(0, 13);
            this.lbl_vandedor.TabIndex = 18;
            // 
            // lbl_Comprador
            // 
            this.lbl_Comprador.AutoSize = true;
            this.lbl_Comprador.Location = new System.Drawing.Point(118, 45);
            this.lbl_Comprador.Name = "lbl_Comprador";
            this.lbl_Comprador.Size = new System.Drawing.Size(0, 13);
            this.lbl_Comprador.TabIndex = 17;
            // 
            // lbl_hash
            // 
            this.lbl_hash.AutoSize = true;
            this.lbl_hash.Location = new System.Drawing.Point(118, 29);
            this.lbl_hash.Name = "lbl_hash";
            this.lbl_hash.Size = new System.Drawing.Size(0, 13);
            this.lbl_hash.TabIndex = 16;
            // 
            // label12
            // 
            this.label12.AutoSize = true;
            this.label12.Location = new System.Drawing.Point(3, 105);
            this.label12.Name = "label12";
            this.label12.Size = new System.Drawing.Size(30, 13);
            this.label12.TabIndex = 15;
            this.label12.Text = "Data";
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Location = new System.Drawing.Point(3, 89);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(68, 13);
            this.label11.TabIndex = 14;
            this.label11.Text = "HashAnterior";
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(3, 76);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(31, 13);
            this.label10.TabIndex = 13;
            this.label10.Text = "Valor";
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(3, 61);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(53, 13);
            this.label9.TabIndex = 12;
            this.label9.Text = "Vendedor";
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(3, 45);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(58, 13);
            this.label8.TabIndex = 11;
            this.label8.Text = "Comprador";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(3, 29);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(32, 13);
            this.label4.TabIndex = 10;
            this.label4.Text = "Hash";
            // 
            // buttonEdit
            // 
            this.buttonEdit.Enabled = false;
            this.buttonEdit.Location = new System.Drawing.Point(3, 193);
            this.buttonEdit.Name = "buttonEdit";
            this.buttonEdit.Size = new System.Drawing.Size(382, 23);
            this.buttonEdit.TabIndex = 9;
            this.buttonEdit.Text = "Atualizar";
            this.buttonEdit.UseVisualStyleBackColor = true;
            this.buttonEdit.Click += new System.EventHandler(this.buttonEdit_Click);
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(3, 10);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(106, 13);
            this.label6.TabIndex = 8;
            this.label6.Text = "Ultima Transação";
            // 
            // panel3
            // 
            this.panel3.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.panel3.Controls.Add(this.btnConect);
            this.panel3.Controls.Add(this.label1);
            this.panel3.Controls.Add(this.textNameConect);
            this.panel3.Controls.Add(this.label7);
            this.panel3.Location = new System.Drawing.Point(12, 12);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(118, 110);
            this.panel3.TabIndex = 10;
            // 
            // btnConect
            // 
            this.btnConect.Location = new System.Drawing.Point(3, 76);
            this.btnConect.Name = "btnConect";
            this.btnConect.Size = new System.Drawing.Size(110, 23);
            this.btnConect.TabIndex = 9;
            this.btnConect.Text = "Conectar";
            this.btnConect.UseVisualStyleBackColor = true;
            this.btnConect.Click += new System.EventHandler(this.btnConect_ClickAsync);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(16, 10);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(58, 13);
            this.label1.TabIndex = 8;
            this.label1.Text = "Conectar";
            // 
            // textNameConect
            // 
            this.textNameConect.Location = new System.Drawing.Point(6, 45);
            this.textNameConect.Name = "textNameConect";
            this.textNameConect.Size = new System.Drawing.Size(100, 20);
            this.textNameConect.TabIndex = 1;
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(3, 29);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(35, 13);
            this.label7.TabIndex = 1;
            this.label7.Text = "Nome";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(687, 245);
            this.Controls.Add(this.panel3);
            this.Controls.Add(this.panel2);
            this.Controls.Add(this.panel1);
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Monkey Coin";
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.panel2.ResumeLayout(false);
            this.panel2.PerformLayout();
            this.panel3.ResumeLayout(false);
            this.panel3.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Button buttonADD;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox textCidadeAd;
        private System.Windows.Forms.TextBox textNomeAd;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.Button buttonEdit;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Panel panel3;
        private System.Windows.Forms.Button btnConect;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox textNameConect;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label lbl_hash_atual;
        private System.Windows.Forms.Label label19;
        private System.Windows.Forms.Label lbl_data;
        private System.Windows.Forms.Label lbl_hashAnterior;
        private System.Windows.Forms.Label lbl_valor;
        private System.Windows.Forms.Label lbl_vandedor;
        private System.Windows.Forms.Label lbl_Comprador;
        private System.Windows.Forms.Label lbl_hash;
        private System.Windows.Forms.Label label12;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Label label4;
    }
}

