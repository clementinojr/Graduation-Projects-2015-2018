namespace FirebaseApp
{
    partial class login
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.texNameUsu = new System.Windows.Forms.TextBox();
            this.Conectar = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(13, 13);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(57, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Seu Nome";
            // 
            // texNameUsu
            // 
            this.texNameUsu.Location = new System.Drawing.Point(16, 30);
            this.texNameUsu.Name = "texNameUsu";
            this.texNameUsu.Size = new System.Drawing.Size(100, 20);
            this.texNameUsu.TabIndex = 1;
            // 
            // Conectar
            // 
            this.Conectar.Location = new System.Drawing.Point(16, 56);
            this.Conectar.Name = "Conectar";
            this.Conectar.Size = new System.Drawing.Size(100, 23);
            this.Conectar.TabIndex = 2;
            this.Conectar.Text = "Conectar";
            this.Conectar.UseVisualStyleBackColor = true;
            // 
            // login
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(138, 93);
            this.Controls.Add(this.Conectar);
            this.Controls.Add(this.texNameUsu);
            this.Controls.Add(this.label1);
            this.Name = "login";
            this.Text = "login";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox texNameUsu;
        private System.Windows.Forms.Button Conectar;
    }
}