package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class planbro extends GXProcedure
{
   public planbro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( planbro.class ), "" );
   }

   public planbro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 ,
                          String[] aP3 ,
                          short[] aP4 ,
                          short[] aP5 ,
                          String[] aP6 ,
                          short[] aP7 ,
                          java.math.BigDecimal[] aP8 ,
                          short[] aP9 ,
                          short[] aP10 ,
                          short[] aP11 ,
                          short[] aP12 )
   {
      planbro.this.aP13 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        short[] aP9 ,
                        short[] aP10 ,
                        short[] aP11 ,
                        short[] aP12 ,
                        int[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             short[] aP9 ,
                             short[] aP10 ,
                             short[] aP11 ,
                             short[] aP12 ,
                             int[] aP13 )
   {
      planbro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      planbro.this.AV16CliCod = aP1[0];
      this.aP1 = aP1;
      planbro.this.AV17ArtCod = aP2[0];
      this.aP2 = aP2;
      planbro.this.AV18NMtr = aP3[0];
      this.aP3 = aP3;
      planbro.this.AV19ManCod = aP4[0];
      this.aP4 = aP4;
      planbro.this.AV20TipConCod = aP5[0];
      this.aP5 = aP5;
      planbro.this.AV21MaqCod = aP6[0];
      this.aP6 = aP6;
      planbro.this.AV22MaqNhd = aP7[0];
      this.aP7 = aP7;
      planbro.this.AV15MaxKilLan = aP8[0];
      this.aP8 = aP8;
      planbro.this.AV23LanBroLin = aP9[0];
      this.aP9 = aP9;
      planbro.this.AV24TipArtCod = aP10[0];
      this.aP10 = aP10;
      planbro.this.AV25LanBroDia = aP11[0];
      this.aP11 = aP11;
      planbro.this.AV28MaxConLan = aP12[0];
      this.aP12 = aP12;
      planbro.this.AV30Conos = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13Coincide = (byte)(0) ;
      AV14CoincideA = (byte)(0) ;
      AV15MaxKilLan = DecimalUtil.ZERO ;
      AV23LanBroLin = (short)(0) ;
      AV25LanBroDia = (short)(0) ;
      AV28MaxConLan = (short)(0) ;
      AV26TotalC = (byte)(0) ;
      /* Using cursor P00NJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3405LanBroDia = P00NJ2_A3405LanBroDia[0] ;
         n3405LanBroDia = P00NJ2_n3405LanBroDia[0] ;
         A3335LanBroKgm = P00NJ2_A3335LanBroKgm[0] ;
         n3335LanBroKgm = P00NJ2_n3335LanBroKgm[0] ;
         A252CliCod = P00NJ2_A252CliCod[0] ;
         n252CliCod = P00NJ2_n252CliCod[0] ;
         A65ArtCod = P00NJ2_A65ArtCod[0] ;
         n65ArtCod = P00NJ2_n65ArtCod[0] ;
         A3406LanBroTAr = P00NJ2_A3406LanBroTAr[0] ;
         n3406LanBroTAr = P00NJ2_n3406LanBroTAr[0] ;
         A3334LanBroNMtr = P00NJ2_A3334LanBroNMtr[0] ;
         n3334LanBroNMtr = P00NJ2_n3334LanBroNMtr[0] ;
         A2248ManCod = P00NJ2_A2248ManCod[0] ;
         n2248ManCod = P00NJ2_n2248ManCod[0] ;
         A1157TipConCod = P00NJ2_A1157TipConCod[0] ;
         n1157TipConCod = P00NJ2_n1157TipConCod[0] ;
         A602MaqCod = P00NJ2_A602MaqCod[0] ;
         n602MaqCod = P00NJ2_n602MaqCod[0] ;
         A3336LanBroNhd = P00NJ2_A3336LanBroNhd[0] ;
         n3336LanBroNhd = P00NJ2_n3336LanBroNhd[0] ;
         A3333LanBroLin = P00NJ2_A3333LanBroLin[0] ;
         A3331LanBroCod = P00NJ2_A3331LanBroCod[0] ;
         if ( GXutil.strcmp(GXutil.substring( AV17ArtCod, 1, 2), httpContext.getMessage( "CT", "")) == 0 )
         {
            if ( A3333LanBroLin == 1 )
            {
               AV15MaxKilLan = A3335LanBroKgm ;
               AV23LanBroLin = A3333LanBroLin ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! (0==A252CliCod) )
         {
            AV26TotalC = (byte)(AV26TotalC+1) ;
         }
         if ( ! (GXutil.strcmp("", A65ArtCod)==0) )
         {
            AV26TotalC = (byte)(AV26TotalC+1) ;
         }
         if ( ! (0==A3406LanBroTAr) )
         {
            AV26TotalC = (byte)(AV26TotalC+1) ;
         }
         if ( ! (GXutil.strcmp("", A3334LanBroNMtr)==0) )
         {
            AV26TotalC = (byte)(AV26TotalC+1) ;
         }
         if ( ! (0==A2248ManCod) )
         {
            AV26TotalC = (byte)(AV26TotalC+1) ;
         }
         if ( ! (0==A1157TipConCod) )
         {
            AV26TotalC = (byte)(AV26TotalC+1) ;
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV26TotalC = (byte)(AV26TotalC+1) ;
         }
         if ( ! (0==A3336LanBroNhd) )
         {
            AV26TotalC = (byte)(AV26TotalC+1) ;
         }
         if ( ( A252CliCod == AV16CliCod ) && ! (0==A252CliCod) )
         {
            AV13Coincide = (byte)(AV13Coincide+1) ;
         }
         if ( ( GXutil.strcmp(A65ArtCod, AV17ArtCod) == 0 ) && ! (GXutil.strcmp("", A65ArtCod)==0) )
         {
            AV13Coincide = (byte)(AV13Coincide+1) ;
         }
         if ( ( GXutil.strcmp(A3334LanBroNMtr, AV18NMtr) == 0 ) && ! (GXutil.strcmp("", A3334LanBroNMtr)==0) )
         {
            AV13Coincide = (byte)(AV13Coincide+1) ;
         }
         if ( ( A2248ManCod == AV19ManCod ) && ! (0==A2248ManCod) )
         {
            AV13Coincide = (byte)(AV13Coincide+1) ;
         }
         if ( ( A1157TipConCod == AV20TipConCod ) && ! (0==A1157TipConCod) )
         {
            AV13Coincide = (byte)(AV13Coincide+1) ;
         }
         if ( ( GXutil.strcmp(A602MaqCod, AV21MaqCod) == 0 ) && ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV13Coincide = (byte)(AV13Coincide+1) ;
         }
         if ( ( A3336LanBroNhd == AV22MaqNhd ) && ! (0==A3336LanBroNhd) )
         {
            AV13Coincide = (byte)(AV13Coincide+1) ;
         }
         if ( ( A3406LanBroTAr == AV24TipArtCod ) && ! (0==A3406LanBroTAr) )
         {
            AV13Coincide = (byte)(AV13Coincide+1) ;
         }
         if ( AV26TotalC == AV13Coincide )
         {
            if ( AV13Coincide > AV14CoincideA )
            {
               AV14CoincideA = AV13Coincide ;
               AV15MaxKilLan = A3335LanBroKgm ;
               AV23LanBroLin = A3333LanBroLin ;
            }
         }
         AV26TotalC = (byte)(0) ;
         AV13Coincide = (byte)(0) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV26TotalC = (byte)(0) ;
      AV13Coincide = (byte)(0) ;
      AV14CoincideA = (byte)(0) ;
      /* Using cursor P00NJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A3335LanBroKgm = P00NJ3_A3335LanBroKgm[0] ;
         n3335LanBroKgm = P00NJ3_n3335LanBroKgm[0] ;
         A252CliCod = P00NJ3_A252CliCod[0] ;
         n252CliCod = P00NJ3_n252CliCod[0] ;
         A65ArtCod = P00NJ3_A65ArtCod[0] ;
         n65ArtCod = P00NJ3_n65ArtCod[0] ;
         A3406LanBroTAr = P00NJ3_A3406LanBroTAr[0] ;
         n3406LanBroTAr = P00NJ3_n3406LanBroTAr[0] ;
         A3334LanBroNMtr = P00NJ3_A3334LanBroNMtr[0] ;
         n3334LanBroNMtr = P00NJ3_n3334LanBroNMtr[0] ;
         A2248ManCod = P00NJ3_A2248ManCod[0] ;
         n2248ManCod = P00NJ3_n2248ManCod[0] ;
         A1157TipConCod = P00NJ3_A1157TipConCod[0] ;
         n1157TipConCod = P00NJ3_n1157TipConCod[0] ;
         A602MaqCod = P00NJ3_A602MaqCod[0] ;
         n602MaqCod = P00NJ3_n602MaqCod[0] ;
         A3336LanBroNhd = P00NJ3_A3336LanBroNhd[0] ;
         n3336LanBroNhd = P00NJ3_n3336LanBroNhd[0] ;
         A3408LanBroCon = P00NJ3_A3408LanBroCon[0] ;
         n3408LanBroCon = P00NJ3_n3408LanBroCon[0] ;
         A3405LanBroDia = P00NJ3_A3405LanBroDia[0] ;
         n3405LanBroDia = P00NJ3_n3405LanBroDia[0] ;
         A3333LanBroLin = P00NJ3_A3333LanBroLin[0] ;
         A3331LanBroCod = P00NJ3_A3331LanBroCod[0] ;
         if ( ! (0==A252CliCod) )
         {
            AV26TotalC = (byte)(AV26TotalC+1) ;
         }
         if ( ! (GXutil.strcmp("", A65ArtCod)==0) )
         {
            AV26TotalC = (byte)(AV26TotalC+1) ;
         }
         if ( ! (0==A3406LanBroTAr) )
         {
            AV26TotalC = (byte)(AV26TotalC+1) ;
         }
         if ( ! (GXutil.strcmp("", A3334LanBroNMtr)==0) )
         {
            AV26TotalC = (byte)(AV26TotalC+1) ;
         }
         if ( ! (0==A2248ManCod) )
         {
            AV26TotalC = (byte)(AV26TotalC+1) ;
         }
         if ( ! (0==A1157TipConCod) )
         {
            AV26TotalC = (byte)(AV26TotalC+1) ;
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV26TotalC = (byte)(AV26TotalC+1) ;
         }
         if ( ! (0==A3336LanBroNhd) )
         {
            AV26TotalC = (byte)(AV26TotalC+1) ;
         }
         if ( ( A252CliCod == AV16CliCod ) && ! (0==A252CliCod) )
         {
            AV13Coincide = (byte)(AV13Coincide+1) ;
         }
         if ( ( GXutil.strcmp(A65ArtCod, AV17ArtCod) == 0 ) && ! (GXutil.strcmp("", A65ArtCod)==0) )
         {
            AV13Coincide = (byte)(AV13Coincide+1) ;
         }
         if ( ( GXutil.strcmp(A3334LanBroNMtr, AV18NMtr) == 0 ) && ! (GXutil.strcmp("", A3334LanBroNMtr)==0) )
         {
            AV13Coincide = (byte)(AV13Coincide+1) ;
         }
         if ( ( A2248ManCod == AV19ManCod ) && ! (0==A2248ManCod) )
         {
            AV13Coincide = (byte)(AV13Coincide+1) ;
         }
         if ( ( A1157TipConCod == AV20TipConCod ) && ! (0==A1157TipConCod) )
         {
            AV13Coincide = (byte)(AV13Coincide+1) ;
         }
         if ( ( GXutil.strcmp(A602MaqCod, AV21MaqCod) == 0 ) && ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV13Coincide = (byte)(AV13Coincide+1) ;
         }
         if ( ( A3336LanBroNhd == AV22MaqNhd ) && ! (0==A3336LanBroNhd) )
         {
            AV13Coincide = (byte)(AV13Coincide+1) ;
         }
         if ( ( A3406LanBroTAr == AV24TipArtCod ) && ! (0==A3406LanBroTAr) )
         {
            AV13Coincide = (byte)(AV13Coincide+1) ;
         }
         if ( AV26TotalC == AV13Coincide )
         {
            if ( AV13Coincide > AV14CoincideA )
            {
               if ( AV30Conos >= A3408LanBroCon )
               {
                  AV14CoincideA = AV13Coincide ;
                  AV25LanBroDia = A3405LanBroDia ;
                  AV28MaxConLan = A3408LanBroCon ;
               }
            }
         }
         AV26TotalC = (byte)(0) ;
         AV13Coincide = (byte)(0) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = planbro.this.A396EmprCod;
      this.aP1[0] = planbro.this.AV16CliCod;
      this.aP2[0] = planbro.this.AV17ArtCod;
      this.aP3[0] = planbro.this.AV18NMtr;
      this.aP4[0] = planbro.this.AV19ManCod;
      this.aP5[0] = planbro.this.AV20TipConCod;
      this.aP6[0] = planbro.this.AV21MaqCod;
      this.aP7[0] = planbro.this.AV22MaqNhd;
      this.aP8[0] = planbro.this.AV15MaxKilLan;
      this.aP9[0] = planbro.this.AV23LanBroLin;
      this.aP10[0] = planbro.this.AV24TipArtCod;
      this.aP11[0] = planbro.this.AV25LanBroDia;
      this.aP12[0] = planbro.this.AV28MaxConLan;
      this.aP13[0] = planbro.this.AV30Conos;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P00NJ2_A396EmprCod = new String[] {""} ;
      P00NJ2_A3405LanBroDia = new short[1] ;
      P00NJ2_n3405LanBroDia = new boolean[] {false} ;
      P00NJ2_A3335LanBroKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00NJ2_n3335LanBroKgm = new boolean[] {false} ;
      P00NJ2_A252CliCod = new int[1] ;
      P00NJ2_n252CliCod = new boolean[] {false} ;
      P00NJ2_A65ArtCod = new String[] {""} ;
      P00NJ2_n65ArtCod = new boolean[] {false} ;
      P00NJ2_A3406LanBroTAr = new short[1] ;
      P00NJ2_n3406LanBroTAr = new boolean[] {false} ;
      P00NJ2_A3334LanBroNMtr = new String[] {""} ;
      P00NJ2_n3334LanBroNMtr = new boolean[] {false} ;
      P00NJ2_A2248ManCod = new short[1] ;
      P00NJ2_n2248ManCod = new boolean[] {false} ;
      P00NJ2_A1157TipConCod = new short[1] ;
      P00NJ2_n1157TipConCod = new boolean[] {false} ;
      P00NJ2_A602MaqCod = new String[] {""} ;
      P00NJ2_n602MaqCod = new boolean[] {false} ;
      P00NJ2_A3336LanBroNhd = new short[1] ;
      P00NJ2_n3336LanBroNhd = new boolean[] {false} ;
      P00NJ2_A3333LanBroLin = new short[1] ;
      P00NJ2_A3331LanBroCod = new byte[1] ;
      A3335LanBroKgm = DecimalUtil.ZERO ;
      A65ArtCod = "" ;
      A3334LanBroNMtr = "" ;
      A602MaqCod = "" ;
      P00NJ3_A396EmprCod = new String[] {""} ;
      P00NJ3_A3335LanBroKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00NJ3_n3335LanBroKgm = new boolean[] {false} ;
      P00NJ3_A252CliCod = new int[1] ;
      P00NJ3_n252CliCod = new boolean[] {false} ;
      P00NJ3_A65ArtCod = new String[] {""} ;
      P00NJ3_n65ArtCod = new boolean[] {false} ;
      P00NJ3_A3406LanBroTAr = new short[1] ;
      P00NJ3_n3406LanBroTAr = new boolean[] {false} ;
      P00NJ3_A3334LanBroNMtr = new String[] {""} ;
      P00NJ3_n3334LanBroNMtr = new boolean[] {false} ;
      P00NJ3_A2248ManCod = new short[1] ;
      P00NJ3_n2248ManCod = new boolean[] {false} ;
      P00NJ3_A1157TipConCod = new short[1] ;
      P00NJ3_n1157TipConCod = new boolean[] {false} ;
      P00NJ3_A602MaqCod = new String[] {""} ;
      P00NJ3_n602MaqCod = new boolean[] {false} ;
      P00NJ3_A3336LanBroNhd = new short[1] ;
      P00NJ3_n3336LanBroNhd = new boolean[] {false} ;
      P00NJ3_A3408LanBroCon = new short[1] ;
      P00NJ3_n3408LanBroCon = new boolean[] {false} ;
      P00NJ3_A3405LanBroDia = new short[1] ;
      P00NJ3_n3405LanBroDia = new boolean[] {false} ;
      P00NJ3_A3333LanBroLin = new short[1] ;
      P00NJ3_A3331LanBroCod = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.planbro__default(),
         new Object[] {
             new Object[] {
            P00NJ2_A396EmprCod, P00NJ2_A3405LanBroDia, P00NJ2_n3405LanBroDia, P00NJ2_A3335LanBroKgm, P00NJ2_n3335LanBroKgm, P00NJ2_A252CliCod, P00NJ2_n252CliCod, P00NJ2_A65ArtCod, P00NJ2_n65ArtCod, P00NJ2_A3406LanBroTAr,
            P00NJ2_n3406LanBroTAr, P00NJ2_A3334LanBroNMtr, P00NJ2_n3334LanBroNMtr, P00NJ2_A2248ManCod, P00NJ2_n2248ManCod, P00NJ2_A1157TipConCod, P00NJ2_n1157TipConCod, P00NJ2_A602MaqCod, P00NJ2_n602MaqCod, P00NJ2_A3336LanBroNhd,
            P00NJ2_n3336LanBroNhd, P00NJ2_A3333LanBroLin, P00NJ2_A3331LanBroCod
            }
            , new Object[] {
            P00NJ3_A396EmprCod, P00NJ3_A3335LanBroKgm, P00NJ3_n3335LanBroKgm, P00NJ3_A252CliCod, P00NJ3_n252CliCod, P00NJ3_A65ArtCod, P00NJ3_n65ArtCod, P00NJ3_A3406LanBroTAr, P00NJ3_n3406LanBroTAr, P00NJ3_A3334LanBroNMtr,
            P00NJ3_n3334LanBroNMtr, P00NJ3_A2248ManCod, P00NJ3_n2248ManCod, P00NJ3_A1157TipConCod, P00NJ3_n1157TipConCod, P00NJ3_A602MaqCod, P00NJ3_n602MaqCod, P00NJ3_A3336LanBroNhd, P00NJ3_n3336LanBroNhd, P00NJ3_A3408LanBroCon,
            P00NJ3_n3408LanBroCon, P00NJ3_A3405LanBroDia, P00NJ3_n3405LanBroDia, P00NJ3_A3333LanBroLin, P00NJ3_A3331LanBroCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13Coincide ;
   private byte AV14CoincideA ;
   private byte AV26TotalC ;
   private byte A3331LanBroCod ;
   private short AV19ManCod ;
   private short AV20TipConCod ;
   private short AV22MaqNhd ;
   private short AV23LanBroLin ;
   private short AV24TipArtCod ;
   private short AV25LanBroDia ;
   private short AV28MaxConLan ;
   private short A3405LanBroDia ;
   private short A3406LanBroTAr ;
   private short A2248ManCod ;
   private short A1157TipConCod ;
   private short A3336LanBroNhd ;
   private short A3333LanBroLin ;
   private short A3408LanBroCon ;
   private short Gx_err ;
   private int AV16CliCod ;
   private int AV30Conos ;
   private int A252CliCod ;
   private java.math.BigDecimal AV15MaxKilLan ;
   private java.math.BigDecimal A3335LanBroKgm ;
   private String A396EmprCod ;
   private String AV17ArtCod ;
   private String AV18NMtr ;
   private String AV21MaqCod ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A3334LanBroNMtr ;
   private String A602MaqCod ;
   private boolean n3405LanBroDia ;
   private boolean n3335LanBroKgm ;
   private boolean n252CliCod ;
   private boolean n65ArtCod ;
   private boolean n3406LanBroTAr ;
   private boolean n3334LanBroNMtr ;
   private boolean n2248ManCod ;
   private boolean n1157TipConCod ;
   private boolean n602MaqCod ;
   private boolean n3336LanBroNhd ;
   private boolean n3408LanBroCon ;
   private int[] aP13 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private short[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private short[] aP9 ;
   private short[] aP10 ;
   private short[] aP11 ;
   private short[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P00NJ2_A396EmprCod ;
   private short[] P00NJ2_A3405LanBroDia ;
   private boolean[] P00NJ2_n3405LanBroDia ;
   private java.math.BigDecimal[] P00NJ2_A3335LanBroKgm ;
   private boolean[] P00NJ2_n3335LanBroKgm ;
   private int[] P00NJ2_A252CliCod ;
   private boolean[] P00NJ2_n252CliCod ;
   private String[] P00NJ2_A65ArtCod ;
   private boolean[] P00NJ2_n65ArtCod ;
   private short[] P00NJ2_A3406LanBroTAr ;
   private boolean[] P00NJ2_n3406LanBroTAr ;
   private String[] P00NJ2_A3334LanBroNMtr ;
   private boolean[] P00NJ2_n3334LanBroNMtr ;
   private short[] P00NJ2_A2248ManCod ;
   private boolean[] P00NJ2_n2248ManCod ;
   private short[] P00NJ2_A1157TipConCod ;
   private boolean[] P00NJ2_n1157TipConCod ;
   private String[] P00NJ2_A602MaqCod ;
   private boolean[] P00NJ2_n602MaqCod ;
   private short[] P00NJ2_A3336LanBroNhd ;
   private boolean[] P00NJ2_n3336LanBroNhd ;
   private short[] P00NJ2_A3333LanBroLin ;
   private byte[] P00NJ2_A3331LanBroCod ;
   private String[] P00NJ3_A396EmprCod ;
   private java.math.BigDecimal[] P00NJ3_A3335LanBroKgm ;
   private boolean[] P00NJ3_n3335LanBroKgm ;
   private int[] P00NJ3_A252CliCod ;
   private boolean[] P00NJ3_n252CliCod ;
   private String[] P00NJ3_A65ArtCod ;
   private boolean[] P00NJ3_n65ArtCod ;
   private short[] P00NJ3_A3406LanBroTAr ;
   private boolean[] P00NJ3_n3406LanBroTAr ;
   private String[] P00NJ3_A3334LanBroNMtr ;
   private boolean[] P00NJ3_n3334LanBroNMtr ;
   private short[] P00NJ3_A2248ManCod ;
   private boolean[] P00NJ3_n2248ManCod ;
   private short[] P00NJ3_A1157TipConCod ;
   private boolean[] P00NJ3_n1157TipConCod ;
   private String[] P00NJ3_A602MaqCod ;
   private boolean[] P00NJ3_n602MaqCod ;
   private short[] P00NJ3_A3336LanBroNhd ;
   private boolean[] P00NJ3_n3336LanBroNhd ;
   private short[] P00NJ3_A3408LanBroCon ;
   private boolean[] P00NJ3_n3408LanBroCon ;
   private short[] P00NJ3_A3405LanBroDia ;
   private boolean[] P00NJ3_n3405LanBroDia ;
   private short[] P00NJ3_A3333LanBroLin ;
   private byte[] P00NJ3_A3331LanBroCod ;
}

final  class planbro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00NJ2", "SELECT EmprCod, LanBroDia, LanBroKgm, CliCod, ArtCod, LanBroTAr, LanBroNMtr, ManCod, TipConCod, MaqCod, LanBroNhd, LanBroLin, LanBroCod FROM TXPLANBRL WHERE (EmprCod = ?) AND (LanBroDia = 0) ORDER BY EmprCod, LanBroCod, LanBroLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00NJ3", "SELECT EmprCod, LanBroKgm, CliCod, ArtCod, LanBroTAr, LanBroNMtr, ManCod, TipConCod, MaqCod, LanBroNhd, LanBroCon, LanBroDia, LanBroLin, LanBroCod FROM TXPLANBRL WHERE (EmprCod = ?) AND (LanBroKgm = 0) ORDER BY EmprCod, LanBroCod, LanBroLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12);
               ((byte[]) buf[22])[0] = rslt.getByte(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((byte[]) buf[24])[0] = rslt.getByte(14);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

