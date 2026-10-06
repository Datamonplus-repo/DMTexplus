package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partvalp extends GXProcedure
{
   public partvalp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partvalp.class ), "" );
   }

   public partvalp( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           byte[] aP5 ,
                           String[] aP6 ,
                           int[] aP7 )
   {
      partvalp.this.aP8 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        byte[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 )
   {
      partvalp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partvalp.this.AV14CliCod = aP1[0];
      this.aP1 = aP1;
      partvalp.this.AV15ForSer = aP2[0];
      this.aP2 = aP2;
      partvalp.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      partvalp.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      partvalp.this.AV16TipColCod = aP5[0];
      this.aP5 = aP5;
      partvalp.this.AV17ForNomCli = aP6[0];
      this.aP6 = aP6;
      partvalp.this.AV18ForNumCli = aP7[0];
      this.aP7 = aP7;
      partvalp.this.AV13Ok = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13Ok = (byte)(2) ;
      AV25GXLvl3 = (byte)(0) ;
      /* Using cursor P02XO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), AV15ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(AV16TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P02XO2_A831TipColCod[0] ;
         A494ForSer = P02XO2_A494ForSer[0] ;
         A252CliCod = P02XO2_A252CliCod[0] ;
         A486ForNumCol = P02XO2_A486ForNumCol[0] ;
         AV25GXLvl3 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV25GXLvl3 == 0 )
      {
         AV26GXLvl20 = (byte)(0) ;
         /* Using cursor P02XO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), AV15ForSer, A482ForColNom, Integer.valueOf(A483ForColNum)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A494ForSer = P02XO3_A494ForSer[0] ;
            A252CliCod = P02XO3_A252CliCod[0] ;
            A486ForNumCol = P02XO3_A486ForNumCol[0] ;
            A832TipColDsc = P02XO3_A832TipColDsc[0] ;
            n832TipColDsc = P02XO3_n832TipColDsc[0] ;
            A831TipColCod = P02XO3_A831TipColCod[0] ;
            A832TipColDsc = P02XO3_A832TipColDsc[0] ;
            n832TipColDsc = P02XO3_n832TipColDsc[0] ;
            AV26GXLvl20 = (byte)(1) ;
            Gx_msg = httpContext.getMessage( "Color inexistente para el cliente/artículo/Tipo de colorante.", "") + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "Se encontró una fórmula con el mismo cliente/artículo y ", "") + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "Tipo de Colorante : ", "") + GXutil.trim( A832TipColDsc) + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "Es correcta?", "") ;
            AV16TipColCod = A831TipColCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV26GXLvl20 == 0 )
         {
            /* Using cursor P02XO4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), AV15ForSer});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A65ArtCod = P02XO4_A65ArtCod[0] ;
               A252CliCod = P02XO4_A252CliCod[0] ;
               A829TipArtCod = P02XO4_A829TipArtCod[0] ;
               AV19TipArtCod = A829TipArtCod ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
            AV29GXLvl44 = (byte)(0) ;
            /* Using cursor P02XO5 */
            pr_default.execute(3, new Object[] {A396EmprCod, A482ForColNom, Integer.valueOf(A483ForColNum)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A486ForNumCol = P02XO5_A486ForNumCol[0] ;
               A252CliCod = P02XO5_A252CliCod[0] ;
               A494ForSer = P02XO5_A494ForSer[0] ;
               A831TipColCod = P02XO5_A831TipColCod[0] ;
               A1191ForNomCli = P02XO5_A1191ForNomCli[0] ;
               n1191ForNomCli = P02XO5_n1191ForNomCli[0] ;
               A1192ForNumCli = P02XO5_A1192ForNumCli[0] ;
               n1192ForNumCli = P02XO5_n1192ForNumCli[0] ;
               AV29GXLvl44 = (byte)(1) ;
               Gx_msg = httpContext.getMessage( "Color inexistente para el cliente/artículo/Tipo de colorante.", "") + GXutil.chr( (short)(13)) ;
               Gx_msg += httpContext.getMessage( "Desea crear una equivalencia con el mismo color, pero de otro cliente/artículo? ", "") ;
               AV21CliCod1 = A252CliCod ;
               AV22ForSer1 = A494ForSer ;
               /* Execute user subroutine: 'ARTÍCULO' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV19TipArtCod == AV20TipArtCod1 )
               {
                  if ( GXutil.strcmp(AV30Op, httpContext.getMessage( "A", "")) == 0 )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_int2[0] = A252CliCod ;
                     GXv_char3[0] = A494ForSer ;
                     GXv_char4[0] = A482ForColNom ;
                     GXv_int5[0] = A483ForColNum ;
                     GXv_int6[0] = A831TipColCod ;
                     GXv_int7[0] = AV14CliCod ;
                     GXv_char8[0] = AV15ForSer ;
                     GXv_char9[0] = A482ForColNom ;
                     GXv_int10[0] = A483ForColNum ;
                     GXv_int11[0] = A831TipColCod ;
                     GXv_char12[0] = A1191ForNomCli ;
                     GXv_int13[0] = A1192ForNumCli ;
                     GXv_int14[0] = (byte)(1) ;
                     new app.pdupfork(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_int6, GXv_int7, GXv_char8, GXv_char9, GXv_int10, GXv_int11, GXv_char12, GXv_int13, GXv_int14) ;
                     partvalp.this.A396EmprCod = GXv_char1[0] ;
                     partvalp.this.A252CliCod = GXv_int2[0] ;
                     partvalp.this.A494ForSer = GXv_char3[0] ;
                     partvalp.this.A482ForColNom = GXv_char4[0] ;
                     partvalp.this.A483ForColNum = GXv_int5[0] ;
                     partvalp.this.A831TipColCod = GXv_int6[0] ;
                     partvalp.this.AV14CliCod = GXv_int7[0] ;
                     partvalp.this.AV15ForSer = GXv_char8[0] ;
                     partvalp.this.A482ForColNom = GXv_char9[0] ;
                     partvalp.this.A483ForColNum = GXv_int10[0] ;
                     partvalp.this.A831TipColCod = GXv_int11[0] ;
                     partvalp.this.A1191ForNomCli = GXv_char12[0] ;
                     partvalp.this.A1192ForNumCli = GXv_int13[0] ;
                     AV13Ok = (byte)(2) ;
                     AV16TipColCod = A831TipColCod ;
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  else if ( GXutil.strcmp(AV30Op, httpContext.getMessage( "C", "")) == 0 )
                  {
                     Gx_msg = httpContext.getMessage( "No se aceptó hacer duplicado (todos a la vez).", "") ;
                     AV13Ok = (byte)(1) ;
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
               else
               {
                  Gx_msg = httpContext.getMessage( "No se encontro color en colorteca.", "") ;
                  AV13Ok = (byte)(1) ;
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            if ( AV29GXLvl44 == 0 )
            {
               Gx_msg = httpContext.getMessage( "No se encontro color en colorteca.", "") ;
               AV13Ok = (byte)(1) ;
            }
         }
      }
      Gx_msg = "" ;
      AV31GXLvl93 = (byte)(0) ;
      /* Using cursor P02XO6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), AV15ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(AV16TipColCod), Byte.valueOf(AV13Ok)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A831TipColCod = P02XO6_A831TipColCod[0] ;
         A494ForSer = P02XO6_A494ForSer[0] ;
         A252CliCod = P02XO6_A252CliCod[0] ;
         A486ForNumCol = P02XO6_A486ForNumCol[0] ;
         AV31GXLvl93 = (byte)(1) ;
         /* Using cursor P02XO7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Byte.valueOf(AV13Ok)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A719PrdNum = P02XO7_A719PrdNum[0] ;
            A856ValCod = P02XO7_A856ValCod[0] ;
            A481ForCan = P02XO7_A481ForCan[0] ;
            A309ColLin = P02XO7_A309ColLin[0] ;
            A856ValCod = P02XO7_A856ValCod[0] ;
            AV13Ok = (byte)(0) ;
            Gx_msg += httpContext.getMessage( "En Colorantes, ", "") + A719PrdNum ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
         /* Using cursor P02XO8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Byte.valueOf(AV13Ok)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A719PrdNum = P02XO8_A719PrdNum[0] ;
            A856ValCod = P02XO8_A856ValCod[0] ;
            A487ForPrdCan = P02XO8_A487ForPrdCan[0] ;
            A715PrdLin = P02XO8_A715PrdLin[0] ;
            A856ValCod = P02XO8_A856ValCod[0] ;
            AV13Ok = (byte)(0) ;
            Gx_msg += httpContext.getMessage( "En Productos Especiales, ", "") + A719PrdNum ;
            pr_default.readNext(6);
         }
         pr_default.close(6);
         /* Using cursor P02XO9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Byte.valueOf(AV13Ok)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A764ProForCod = P02XO9_A764ProForCod[0] ;
            A1160ProForL = P02XO9_A1160ProForL[0] ;
            /* Using cursor P02XO10 */
            pr_default.execute(8, new Object[] {A396EmprCod, A764ProForCod, Byte.valueOf(AV13Ok)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A770ProForPrd = P02XO10_A770ProForPrd[0] ;
               A762ProForCan = P02XO10_A762ProForCan[0] ;
               A767ProForLin = P02XO10_A767ProForLin[0] ;
               /* Using cursor P02XO11 */
               pr_default.execute(9, new Object[] {A396EmprCod, A770ProForPrd, Byte.valueOf(AV13Ok)});
               while ( (pr_default.getStatus(9) != 101) )
               {
                  A719PrdNum = P02XO11_A719PrdNum[0] ;
                  A856ValCod = P02XO11_A856ValCod[0] ;
                  AV13Ok = (byte)(0) ;
                  Gx_msg += httpContext.getMessage( "En Proceso de Tintura, ", "") + A770ProForPrd ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(9);
               pr_default.readNext(8);
            }
            pr_default.close(8);
            pr_default.readNext(7);
         }
         pr_default.close(7);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      if ( AV31GXLvl93 == 0 )
      {
         Gx_msg += httpContext.getMessage( "Formula no encontrada", "") ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTÍCULO' Routine */
      returnInSub = false ;
      AV37GXLvl140 = (byte)(0) ;
      /* Using cursor P02XO12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV21CliCod1), AV22ForSer1});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A65ArtCod = P02XO12_A65ArtCod[0] ;
         A252CliCod = P02XO12_A252CliCod[0] ;
         A829TipArtCod = P02XO12_A829TipArtCod[0] ;
         AV37GXLvl140 = (byte)(1) ;
         AV20TipArtCod1 = A829TipArtCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
      if ( AV37GXLvl140 == 0 )
      {
         AV20TipArtCod1 = (short)(-1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = partvalp.this.A396EmprCod;
      this.aP1[0] = partvalp.this.AV14CliCod;
      this.aP2[0] = partvalp.this.AV15ForSer;
      this.aP3[0] = partvalp.this.A482ForColNom;
      this.aP4[0] = partvalp.this.A483ForColNum;
      this.aP5[0] = partvalp.this.AV16TipColCod;
      this.aP6[0] = partvalp.this.AV17ForNomCli;
      this.aP7[0] = partvalp.this.AV18ForNumCli;
      this.aP8[0] = partvalp.this.AV13Ok;
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
      P02XO2_A396EmprCod = new String[] {""} ;
      P02XO2_A482ForColNom = new String[] {""} ;
      P02XO2_A483ForColNum = new int[1] ;
      P02XO2_A831TipColCod = new byte[1] ;
      P02XO2_A494ForSer = new String[] {""} ;
      P02XO2_A252CliCod = new int[1] ;
      P02XO2_A486ForNumCol = new int[1] ;
      A494ForSer = "" ;
      P02XO3_A396EmprCod = new String[] {""} ;
      P02XO3_A482ForColNom = new String[] {""} ;
      P02XO3_A483ForColNum = new int[1] ;
      P02XO3_A494ForSer = new String[] {""} ;
      P02XO3_A252CliCod = new int[1] ;
      P02XO3_A486ForNumCol = new int[1] ;
      P02XO3_A832TipColDsc = new String[] {""} ;
      P02XO3_n832TipColDsc = new boolean[] {false} ;
      P02XO3_A831TipColCod = new byte[1] ;
      A832TipColDsc = "" ;
      Gx_msg = "" ;
      P02XO4_A396EmprCod = new String[] {""} ;
      P02XO4_A65ArtCod = new String[] {""} ;
      P02XO4_A252CliCod = new int[1] ;
      P02XO4_A829TipArtCod = new short[1] ;
      A65ArtCod = "" ;
      P02XO5_A396EmprCod = new String[] {""} ;
      P02XO5_A482ForColNom = new String[] {""} ;
      P02XO5_A483ForColNum = new int[1] ;
      P02XO5_A486ForNumCol = new int[1] ;
      P02XO5_A252CliCod = new int[1] ;
      P02XO5_A494ForSer = new String[] {""} ;
      P02XO5_A831TipColCod = new byte[1] ;
      P02XO5_A1191ForNomCli = new String[] {""} ;
      P02XO5_n1191ForNomCli = new boolean[] {false} ;
      P02XO5_A1192ForNumCli = new int[1] ;
      P02XO5_n1192ForNumCli = new boolean[] {false} ;
      A1191ForNomCli = "" ;
      AV22ForSer1 = "" ;
      AV30Op = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char12 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int14 = new byte[1] ;
      P02XO6_A396EmprCod = new String[] {""} ;
      P02XO6_A482ForColNom = new String[] {""} ;
      P02XO6_A483ForColNum = new int[1] ;
      P02XO6_A831TipColCod = new byte[1] ;
      P02XO6_A494ForSer = new String[] {""} ;
      P02XO6_A252CliCod = new int[1] ;
      P02XO6_A486ForNumCol = new int[1] ;
      P02XO7_A396EmprCod = new String[] {""} ;
      P02XO7_A486ForNumCol = new int[1] ;
      P02XO7_A719PrdNum = new String[] {""} ;
      P02XO7_A856ValCod = new byte[1] ;
      P02XO7_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XO7_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      P02XO8_A396EmprCod = new String[] {""} ;
      P02XO8_A486ForNumCol = new int[1] ;
      P02XO8_A719PrdNum = new String[] {""} ;
      P02XO8_A856ValCod = new byte[1] ;
      P02XO8_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XO8_A715PrdLin = new short[1] ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      P02XO9_A396EmprCod = new String[] {""} ;
      P02XO9_A252CliCod = new int[1] ;
      P02XO9_A494ForSer = new String[] {""} ;
      P02XO9_A482ForColNom = new String[] {""} ;
      P02XO9_A483ForColNum = new int[1] ;
      P02XO9_A831TipColCod = new byte[1] ;
      P02XO9_A764ProForCod = new String[] {""} ;
      P02XO9_A1160ProForL = new short[1] ;
      A764ProForCod = "" ;
      P02XO10_A396EmprCod = new String[] {""} ;
      P02XO10_A764ProForCod = new String[] {""} ;
      P02XO10_A770ProForPrd = new String[] {""} ;
      P02XO10_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02XO10_A767ProForLin = new short[1] ;
      A770ProForPrd = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      P02XO11_A396EmprCod = new String[] {""} ;
      P02XO11_A719PrdNum = new String[] {""} ;
      P02XO11_A856ValCod = new byte[1] ;
      P02XO12_A396EmprCod = new String[] {""} ;
      P02XO12_A65ArtCod = new String[] {""} ;
      P02XO12_A252CliCod = new int[1] ;
      P02XO12_A829TipArtCod = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partvalp__default(),
         new Object[] {
             new Object[] {
            P02XO2_A396EmprCod, P02XO2_A482ForColNom, P02XO2_A483ForColNum, P02XO2_A831TipColCod, P02XO2_A494ForSer, P02XO2_A252CliCod, P02XO2_A486ForNumCol
            }
            , new Object[] {
            P02XO3_A396EmprCod, P02XO3_A482ForColNom, P02XO3_A483ForColNum, P02XO3_A494ForSer, P02XO3_A252CliCod, P02XO3_A486ForNumCol, P02XO3_A832TipColDsc, P02XO3_n832TipColDsc, P02XO3_A831TipColCod
            }
            , new Object[] {
            P02XO4_A396EmprCod, P02XO4_A65ArtCod, P02XO4_A252CliCod, P02XO4_A829TipArtCod
            }
            , new Object[] {
            P02XO5_A396EmprCod, P02XO5_A482ForColNom, P02XO5_A483ForColNum, P02XO5_A486ForNumCol, P02XO5_A252CliCod, P02XO5_A494ForSer, P02XO5_A831TipColCod, P02XO5_A1191ForNomCli, P02XO5_n1191ForNomCli, P02XO5_A1192ForNumCli,
            P02XO5_n1192ForNumCli
            }
            , new Object[] {
            P02XO6_A396EmprCod, P02XO6_A482ForColNom, P02XO6_A483ForColNum, P02XO6_A831TipColCod, P02XO6_A494ForSer, P02XO6_A252CliCod, P02XO6_A486ForNumCol
            }
            , new Object[] {
            P02XO7_A396EmprCod, P02XO7_A486ForNumCol, P02XO7_A719PrdNum, P02XO7_A856ValCod, P02XO7_A481ForCan, P02XO7_A309ColLin
            }
            , new Object[] {
            P02XO8_A396EmprCod, P02XO8_A486ForNumCol, P02XO8_A719PrdNum, P02XO8_A856ValCod, P02XO8_A487ForPrdCan, P02XO8_A715PrdLin
            }
            , new Object[] {
            P02XO9_A396EmprCod, P02XO9_A252CliCod, P02XO9_A494ForSer, P02XO9_A482ForColNom, P02XO9_A483ForColNum, P02XO9_A831TipColCod, P02XO9_A764ProForCod, P02XO9_A1160ProForL
            }
            , new Object[] {
            P02XO10_A396EmprCod, P02XO10_A764ProForCod, P02XO10_A770ProForPrd, P02XO10_A762ProForCan, P02XO10_A767ProForLin
            }
            , new Object[] {
            P02XO11_A396EmprCod, P02XO11_A719PrdNum, P02XO11_A856ValCod
            }
            , new Object[] {
            P02XO12_A396EmprCod, P02XO12_A65ArtCod, P02XO12_A252CliCod, P02XO12_A829TipArtCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16TipColCod ;
   private byte AV13Ok ;
   private byte AV25GXLvl3 ;
   private byte A831TipColCod ;
   private byte AV26GXLvl20 ;
   private byte AV29GXLvl44 ;
   private byte GXv_int6[] ;
   private byte GXv_int11[] ;
   private byte GXv_int14[] ;
   private byte AV31GXLvl93 ;
   private byte A856ValCod ;
   private byte AV37GXLvl140 ;
   private short A829TipArtCod ;
   private short AV19TipArtCod ;
   private short AV20TipArtCod1 ;
   private short A309ColLin ;
   private short A715PrdLin ;
   private short A1160ProForL ;
   private short A767ProForLin ;
   private short Gx_err ;
   private int AV14CliCod ;
   private int A483ForColNum ;
   private int AV18ForNumCli ;
   private int A252CliCod ;
   private int A486ForNumCol ;
   private int A1192ForNumCli ;
   private int AV21CliCod1 ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private int GXv_int7[] ;
   private int GXv_int10[] ;
   private int GXv_int13[] ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal A487ForPrdCan ;
   private java.math.BigDecimal A762ProForCan ;
   private String A396EmprCod ;
   private String AV15ForSer ;
   private String A482ForColNom ;
   private String AV17ForNomCli ;
   private String scmdbuf ;
   private String A494ForSer ;
   private String A832TipColDsc ;
   private String Gx_msg ;
   private String A65ArtCod ;
   private String A1191ForNomCli ;
   private String AV22ForSer1 ;
   private String AV30Op ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char12[] ;
   private String A719PrdNum ;
   private String A764ProForCod ;
   private String A770ProForPrd ;
   private boolean n832TipColDsc ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private boolean returnInSub ;
   private byte[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P02XO2_A396EmprCod ;
   private String[] P02XO2_A482ForColNom ;
   private int[] P02XO2_A483ForColNum ;
   private byte[] P02XO2_A831TipColCod ;
   private String[] P02XO2_A494ForSer ;
   private int[] P02XO2_A252CliCod ;
   private int[] P02XO2_A486ForNumCol ;
   private String[] P02XO3_A396EmprCod ;
   private String[] P02XO3_A482ForColNom ;
   private int[] P02XO3_A483ForColNum ;
   private String[] P02XO3_A494ForSer ;
   private int[] P02XO3_A252CliCod ;
   private int[] P02XO3_A486ForNumCol ;
   private String[] P02XO3_A832TipColDsc ;
   private boolean[] P02XO3_n832TipColDsc ;
   private byte[] P02XO3_A831TipColCod ;
   private String[] P02XO4_A396EmprCod ;
   private String[] P02XO4_A65ArtCod ;
   private int[] P02XO4_A252CliCod ;
   private short[] P02XO4_A829TipArtCod ;
   private String[] P02XO5_A396EmprCod ;
   private String[] P02XO5_A482ForColNom ;
   private int[] P02XO5_A483ForColNum ;
   private int[] P02XO5_A486ForNumCol ;
   private int[] P02XO5_A252CliCod ;
   private String[] P02XO5_A494ForSer ;
   private byte[] P02XO5_A831TipColCod ;
   private String[] P02XO5_A1191ForNomCli ;
   private boolean[] P02XO5_n1191ForNomCli ;
   private int[] P02XO5_A1192ForNumCli ;
   private boolean[] P02XO5_n1192ForNumCli ;
   private String[] P02XO6_A396EmprCod ;
   private String[] P02XO6_A482ForColNom ;
   private int[] P02XO6_A483ForColNum ;
   private byte[] P02XO6_A831TipColCod ;
   private String[] P02XO6_A494ForSer ;
   private int[] P02XO6_A252CliCod ;
   private int[] P02XO6_A486ForNumCol ;
   private String[] P02XO7_A396EmprCod ;
   private int[] P02XO7_A486ForNumCol ;
   private String[] P02XO7_A719PrdNum ;
   private byte[] P02XO7_A856ValCod ;
   private java.math.BigDecimal[] P02XO7_A481ForCan ;
   private short[] P02XO7_A309ColLin ;
   private String[] P02XO8_A396EmprCod ;
   private int[] P02XO8_A486ForNumCol ;
   private String[] P02XO8_A719PrdNum ;
   private byte[] P02XO8_A856ValCod ;
   private java.math.BigDecimal[] P02XO8_A487ForPrdCan ;
   private short[] P02XO8_A715PrdLin ;
   private String[] P02XO9_A396EmprCod ;
   private int[] P02XO9_A252CliCod ;
   private String[] P02XO9_A494ForSer ;
   private String[] P02XO9_A482ForColNom ;
   private int[] P02XO9_A483ForColNum ;
   private byte[] P02XO9_A831TipColCod ;
   private String[] P02XO9_A764ProForCod ;
   private short[] P02XO9_A1160ProForL ;
   private String[] P02XO10_A396EmprCod ;
   private String[] P02XO10_A764ProForCod ;
   private String[] P02XO10_A770ProForPrd ;
   private java.math.BigDecimal[] P02XO10_A762ProForCan ;
   private short[] P02XO10_A767ProForLin ;
   private String[] P02XO11_A396EmprCod ;
   private String[] P02XO11_A719PrdNum ;
   private byte[] P02XO11_A856ValCod ;
   private String[] P02XO12_A396EmprCod ;
   private String[] P02XO12_A65ArtCod ;
   private int[] P02XO12_A252CliCod ;
   private short[] P02XO12_A829TipArtCod ;
}

final  class partvalp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02XO2", "SELECT EmprCod, ForColNom, ForColNum, TipColCod, ForSer, CliCod, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XO3", "SELECT T1.EmprCod, T1.ForColNom, T1.ForColNum, T1.ForSer, T1.CliCod, T1.ForNumCol, T2.TipColDsc, T1.TipColCod FROM (TXPCFORMU T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XO4", "SELECT EmprCod, ArtCod, CliCod, TipArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XO5", "SELECT EmprCod, ForColNom, ForColNum, ForNumCol, CliCod, ForSer, TipColCod, ForNomCli, ForNumCli FROM TXPCFORMU WHERE (EmprCod = ?) AND (ForColNom = ?) AND (ForColNum = ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XO6", "SELECT EmprCod, ForColNom, ForColNum, TipColCod, ForSer, CliCod, ForNumCol FROM TXPCFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?) AND (? = 2) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XO7", "SELECT T1.EmprCod, T1.ForNumCol, T1.PrdNum, T2.ValCod, T1.ForCan, T1.ColLin FROM (TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.ForNumCol = ?) AND (T2.ValCod >= 2) AND (LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) = 6) AND (? = 2) ORDER BY T1.EmprCod, T1.ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XO8", "SELECT T1.EmprCod, T1.ForNumCol, T1.PrdNum, T2.ValCod, T1.ForPrdCan, T1.PrdLin FROM (TXPLPRFOR T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.ForNumCol = ?) AND (T2.ValCod >= 2) AND (LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) = 6) AND (? = 2) ORDER BY T1.EmprCod, T1.ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XO9", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForCod, ProForL FROM TXPLFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?) AND (? = 2) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XO10", "SELECT EmprCod, ProForCod, ProForPrd, ProForCan, ProForLin FROM TXPLPROFO WHERE (EmprCod = ? and ProForCod = ?) AND (? = 2) AND (LENGTH(RTRIM(RTRIM(LTRIM(ProForPrd)))) = 6) ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XO11", "SELECT EmprCod, PrdNum, ValCod FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum = ?) AND (ValCod >= 2) AND (? = 2) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XO12", "SELECT EmprCod, ArtCod, CliCod, TipArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 13);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

