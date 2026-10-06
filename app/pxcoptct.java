package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pxcoptct extends GXProcedure
{
   public pxcoptct( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pxcoptct.class ), "" );
   }

   public pxcoptct( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short[] executeUdp( String[] aP0 ,
                              int[] aP1 ,
                              String[] aP2 ,
                              String[] aP3 ,
                              int[] aP4 ,
                              byte[] aP5 ,
                              String[] aP6 ,
                              String[] aP7 ,
                              String[] aP8 ,
                              String[] AV33Tab_p )
   {
      AV34Tab_l = new short[100] ;
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, AV33Tab_p, AV34Tab_l);
      return AV34Tab_l;
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] AV33Tab_p ,
                        short[] AV34Tab_l )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, AV33Tab_p, AV34Tab_l);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] AV33Tab_p ,
                             short[] AV34Tab_l )
   {
      pxcoptct.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pxcoptct.this.AV15CliCod = aP1[0];
      this.aP1 = aP1;
      pxcoptct.this.AV16ForSer = aP2[0];
      this.aP2 = aP2;
      pxcoptct.this.AV17ForColNom = aP3[0];
      this.aP3 = aP3;
      pxcoptct.this.AV18ForColNum = aP4[0];
      this.aP4 = aP4;
      pxcoptct.this.AV19TipColCod = aP5[0];
      this.aP5 = aP5;
      pxcoptct.this.AV31BarAnt = aP6[0];
      this.aP6 = aP6;
      pxcoptct.this.AV32BarAcc = aP7[0];
      this.aP7 = aP7;
      pxcoptct.this.AV38BarAntpT = aP8[0];
      this.aP8 = aP8;
      pxcoptct.this.AV33Tab_p = AV33Tab_p;
      pxcoptct.this.AV34Tab_l = AV34Tab_l;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV37F_coptct ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COPTCT", ""), GXv_int1) ;
      pxcoptct.this.AV37F_coptct = GXv_int1[0] ;
      /* Execute user subroutine: 'LIMPIAR_TABLA' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV35i = (short)(1) ;
      /* Using cursor P01TW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16ForSer, AV17ForColNom, Integer.valueOf(AV18ForColNum), Byte.valueOf(AV19TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P01TW2_A831TipColCod[0] ;
         A483ForColNum = P01TW2_A483ForColNum[0] ;
         A482ForColNom = P01TW2_A482ForColNom[0] ;
         A494ForSer = P01TW2_A494ForSer[0] ;
         A252CliCod = P01TW2_A252CliCod[0] ;
         A626MatCod = P01TW2_A626MatCod[0] ;
         A583IntCod = P01TW2_A583IntCod[0] ;
         AV26MatCod = A626MatCod ;
         AV27IntCod = A583IntCod ;
         /* Execute user subroutine: 'TIPART' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P01TW3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A764ProForCod = P01TW3_A764ProForCod[0] ;
            n764ProForCod = P01TW3_n764ProForCod[0] ;
            A1160ProForL = P01TW3_A1160ProForL[0] ;
            AV34Tab_l[AV35i-1] = A1160ProForL ;
            AV33Tab_p[AV35i-1] = A764ProForCod ;
            AV35i = (short)(AV35i+1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV37F_coptct == 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P01TW4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Byte.valueOf(AV19TipColCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A831TipColCod = P01TW4_A831TipColCod[0] ;
         A5162TipColLin = P01TW4_A5162TipColLin[0] ;
         /* Execute user subroutine: 'LIMPIAR_TABLA' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV25ForUltLin = (short)(0) ;
      AV35i = (short)(1) ;
      AV36j = (short)(0) ;
      /* Using cursor P01TW5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Byte.valueOf(AV19TipColCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A831TipColCod = P01TW5_A831TipColCod[0] ;
         A5357TipColCla = P01TW5_A5357TipColCla[0] ;
         n5357TipColCla = P01TW5_n5357TipColCla[0] ;
         A764ProForCod = P01TW5_A764ProForCod[0] ;
         n764ProForCod = P01TW5_n764ProForCod[0] ;
         A5162TipColLin = P01TW5_A5162TipColLin[0] ;
         AV23F_ctrl = (byte)(0) ;
         AV24Accion = GXutil.space( (short)(1)) ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = " " ;
         GXv_char4[0] = A5357TipColCla ;
         GXv_int1[0] = AV23F_ctrl ;
         GXv_int5[0] = AV15CliCod ;
         GXv_char6[0] = AV16ForSer ;
         GXv_decimal7[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char8[0] = " " ;
         GXv_char9[0] = AV24Accion ;
         GXv_int10[0] = (short)(0) ;
         GXv_int11[0] = 0 ;
         GXv_char12[0] = " " ;
         GXv_int13[0] = AV26MatCod ;
         GXv_char14[0] = AV17ForColNom ;
         GXv_int15[0] = AV18ForColNum ;
         GXv_int16[0] = AV19TipColCod ;
         GXv_int17[0] = AV27IntCod ;
         GXv_char18[0] = AV31BarAnt ;
         GXv_int19[0] = AV29TipArtFor ;
         GXv_int20[0] = AV30Tipo_pza ;
         GXv_char21[0] = AV32BarAcc ;
         GXv_char22[0] = AV38BarAntpT ;
         new app.pclatc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_int1, GXv_int5, GXv_char6, GXv_decimal7, GXv_char8, GXv_char9, GXv_int10, GXv_int11, GXv_char12, GXv_int13, GXv_char14, GXv_int15, GXv_int16, GXv_int17, GXv_char18, GXv_int19, GXv_int20, GXv_char21, GXv_char22) ;
         pxcoptct.this.A396EmprCod = GXv_char2[0] ;
         pxcoptct.this.A5357TipColCla = GXv_char4[0] ;
         pxcoptct.this.AV23F_ctrl = GXv_int1[0] ;
         pxcoptct.this.AV15CliCod = GXv_int5[0] ;
         pxcoptct.this.AV16ForSer = GXv_char6[0] ;
         pxcoptct.this.AV24Accion = GXv_char9[0] ;
         pxcoptct.this.AV26MatCod = GXv_int13[0] ;
         pxcoptct.this.AV17ForColNom = GXv_char14[0] ;
         pxcoptct.this.AV18ForColNum = GXv_int15[0] ;
         pxcoptct.this.AV19TipColCod = GXv_int16[0] ;
         pxcoptct.this.AV27IntCod = GXv_int17[0] ;
         pxcoptct.this.AV31BarAnt = GXv_char18[0] ;
         pxcoptct.this.AV29TipArtFor = GXv_int19[0] ;
         pxcoptct.this.AV30Tipo_pza = GXv_int20[0] ;
         pxcoptct.this.AV32BarAcc = GXv_char21[0] ;
         pxcoptct.this.AV38BarAntpT = GXv_char22[0] ;
         if ( ( ( AV23F_ctrl == 1 ) && ! (GXutil.strcmp("", A5357TipColCla)==0) ) || (GXutil.strcmp("", A5357TipColCla)==0) )
         {
            if ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "M", "")) == 0 )
            {
               AV36j = (short)(AV35i-1) ;
               if ( AV36j <= 0 )
               {
                  AV36j = (short)(1) ;
               }
               AV33Tab_p[AV36j-1] = A764ProForCod ;
            }
            else
            {
               if ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "E", "")) == 0 )
               {
                  AV36j = (short)(AV35i-1) ;
                  if ( AV36j <= 0 )
                  {
                     AV36j = (short)(1) ;
                  }
                  AV33Tab_p[AV36j-1] = "XXXXXX" ;
               }
               else
               {
                  AV25ForUltLin = (short)(AV25ForUltLin+10) ;
                  AV34Tab_l[AV35i-1] = AV25ForUltLin ;
                  AV33Tab_p[AV35i-1] = A764ProForCod ;
                  AV35i = (short)(AV35i+1) ;
               }
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV40Tab_aux_p[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV39Tab_aux_l[GX_I-1] = (short)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      AV35i = (short)(1) ;
      while ( ! (0==AV34Tab_l[AV35i-1]) )
      {
         AV40Tab_aux_p[AV35i-1] = AV33Tab_p[AV35i-1] ;
         AV39Tab_aux_l[AV35i-1] = AV34Tab_l[AV35i-1] ;
         AV35i = (short)(AV35i+1) ;
      }
      AV35i = (short)(1) ;
      AV36j = (short)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV33Tab_p[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV34Tab_l[GX_I-1] = (short)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      AV25ForUltLin = (short)(10) ;
      while ( ! (0==AV39Tab_aux_l[AV35i-1]) )
      {
         if ( GXutil.strcmp(AV40Tab_aux_p[AV35i-1], "XXXXXX") != 0 )
         {
            AV33Tab_p[AV36j-1] = AV40Tab_aux_p[AV35i-1] ;
            AV34Tab_l[AV36j-1] = AV25ForUltLin ;
            AV36j = (short)(AV36j+1) ;
            AV25ForUltLin = (short)(AV25ForUltLin+10) ;
         }
         AV35i = (short)(AV35i+1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'LIMPIAR_TABLA' Routine */
      returnInSub = false ;
      AV35i = (short)(1) ;
      while ( AV35i < 100 )
      {
         AV34Tab_l[AV35i-1] = (short)(0) ;
         AV33Tab_p[AV35i-1] = GXutil.space( (short)(6)) ;
         AV35i = (short)(AV35i+1) ;
      }
   }

   public void S121( )
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      /* Using cursor P01TW6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16ForSer});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A65ArtCod = P01TW6_A65ArtCod[0] ;
         A252CliCod = P01TW6_A252CliCod[0] ;
         A829TipArtCod = P01TW6_A829TipArtCod[0] ;
         AV29TipArtFor = A829TipArtCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pxcoptct.this.A396EmprCod;
      this.aP1[0] = pxcoptct.this.AV15CliCod;
      this.aP2[0] = pxcoptct.this.AV16ForSer;
      this.aP3[0] = pxcoptct.this.AV17ForColNom;
      this.aP4[0] = pxcoptct.this.AV18ForColNum;
      this.aP5[0] = pxcoptct.this.AV19TipColCod;
      this.aP6[0] = pxcoptct.this.AV31BarAnt;
      this.aP7[0] = pxcoptct.this.AV32BarAcc;
      this.aP8[0] = pxcoptct.this.AV38BarAntpT;
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
      P01TW2_A396EmprCod = new String[] {""} ;
      P01TW2_A831TipColCod = new byte[1] ;
      P01TW2_A483ForColNum = new int[1] ;
      P01TW2_A482ForColNom = new String[] {""} ;
      P01TW2_A494ForSer = new String[] {""} ;
      P01TW2_A252CliCod = new int[1] ;
      P01TW2_A626MatCod = new short[1] ;
      P01TW2_A583IntCod = new byte[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      P01TW3_A396EmprCod = new String[] {""} ;
      P01TW3_A252CliCod = new int[1] ;
      P01TW3_A494ForSer = new String[] {""} ;
      P01TW3_A482ForColNom = new String[] {""} ;
      P01TW3_A483ForColNum = new int[1] ;
      P01TW3_A831TipColCod = new byte[1] ;
      P01TW3_A764ProForCod = new String[] {""} ;
      P01TW3_n764ProForCod = new boolean[] {false} ;
      P01TW3_A1160ProForL = new short[1] ;
      A764ProForCod = "" ;
      P01TW4_A396EmprCod = new String[] {""} ;
      P01TW4_A831TipColCod = new byte[1] ;
      P01TW4_A5162TipColLin = new short[1] ;
      P01TW5_A396EmprCod = new String[] {""} ;
      P01TW5_A831TipColCod = new byte[1] ;
      P01TW5_A5357TipColCla = new String[] {""} ;
      P01TW5_n5357TipColCla = new boolean[] {false} ;
      P01TW5_A764ProForCod = new String[] {""} ;
      P01TW5_n764ProForCod = new boolean[] {false} ;
      P01TW5_A5162TipColLin = new short[1] ;
      A5357TipColCla = "" ;
      AV24Accion = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int1 = new byte[1] ;
      GXv_int5 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new int[1] ;
      GXv_char12 = new String[1] ;
      GXv_int13 = new short[1] ;
      GXv_char14 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_int16 = new byte[1] ;
      GXv_int17 = new byte[1] ;
      GXv_char18 = new String[1] ;
      GXv_int19 = new short[1] ;
      GXv_int20 = new short[1] ;
      GXv_char21 = new String[1] ;
      GXv_char22 = new String[1] ;
      AV40Tab_aux_p = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV40Tab_aux_p[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV39Tab_aux_l = new short[100] ;
      P01TW6_A396EmprCod = new String[] {""} ;
      P01TW6_A65ArtCod = new String[] {""} ;
      P01TW6_A252CliCod = new int[1] ;
      P01TW6_A829TipArtCod = new short[1] ;
      A65ArtCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pxcoptct__default(),
         new Object[] {
             new Object[] {
            P01TW2_A396EmprCod, P01TW2_A831TipColCod, P01TW2_A483ForColNum, P01TW2_A482ForColNom, P01TW2_A494ForSer, P01TW2_A252CliCod, P01TW2_A626MatCod, P01TW2_A583IntCod
            }
            , new Object[] {
            P01TW3_A396EmprCod, P01TW3_A252CliCod, P01TW3_A494ForSer, P01TW3_A482ForColNom, P01TW3_A483ForColNum, P01TW3_A831TipColCod, P01TW3_A764ProForCod, P01TW3_A1160ProForL
            }
            , new Object[] {
            P01TW4_A396EmprCod, P01TW4_A831TipColCod, P01TW4_A5162TipColLin
            }
            , new Object[] {
            P01TW5_A396EmprCod, P01TW5_A831TipColCod, P01TW5_A5357TipColCla, P01TW5_n5357TipColCla, P01TW5_A764ProForCod, P01TW5_n764ProForCod, P01TW5_A5162TipColLin
            }
            , new Object[] {
            P01TW6_A396EmprCod, P01TW6_A65ArtCod, P01TW6_A252CliCod, P01TW6_A829TipArtCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19TipColCod ;
   private byte AV37F_coptct ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV27IntCod ;
   private byte AV23F_ctrl ;
   private byte GXv_int1[] ;
   private byte GXv_int16[] ;
   private byte GXv_int17[] ;
   private short AV35i ;
   private short A626MatCod ;
   private short AV26MatCod ;
   private short A1160ProForL ;
   private short A5162TipColLin ;
   private short AV25ForUltLin ;
   private short AV36j ;
   private short GXv_int10[] ;
   private short GXv_int13[] ;
   private short AV29TipArtFor ;
   private short GXv_int19[] ;
   private short AV30Tipo_pza ;
   private short GXv_int20[] ;
   private short AV39Tab_aux_l[] ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int AV15CliCod ;
   private int AV18ForColNum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int GXv_int5[] ;
   private int GXv_int11[] ;
   private int GXv_int15[] ;
   private int GX_I ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String A396EmprCod ;
   private String AV16ForSer ;
   private String AV17ForColNom ;
   private String AV31BarAnt ;
   private String AV32BarAcc ;
   private String AV38BarAntpT ;
   private String AV33Tab_p[] ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A764ProForCod ;
   private String A5357TipColCla ;
   private String AV24Accion ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char12[] ;
   private String GXv_char14[] ;
   private String GXv_char18[] ;
   private String GXv_char21[] ;
   private String GXv_char22[] ;
   private String AV40Tab_aux_p[] ;
   private String A65ArtCod ;
   private boolean returnInSub ;
   private boolean n764ProForCod ;
   private boolean n5357TipColCla ;
   private short[] AV34Tab_l ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P01TW2_A396EmprCod ;
   private byte[] P01TW2_A831TipColCod ;
   private int[] P01TW2_A483ForColNum ;
   private String[] P01TW2_A482ForColNom ;
   private String[] P01TW2_A494ForSer ;
   private int[] P01TW2_A252CliCod ;
   private short[] P01TW2_A626MatCod ;
   private byte[] P01TW2_A583IntCod ;
   private String[] P01TW3_A396EmprCod ;
   private int[] P01TW3_A252CliCod ;
   private String[] P01TW3_A494ForSer ;
   private String[] P01TW3_A482ForColNom ;
   private int[] P01TW3_A483ForColNum ;
   private byte[] P01TW3_A831TipColCod ;
   private String[] P01TW3_A764ProForCod ;
   private boolean[] P01TW3_n764ProForCod ;
   private short[] P01TW3_A1160ProForL ;
   private String[] P01TW4_A396EmprCod ;
   private byte[] P01TW4_A831TipColCod ;
   private short[] P01TW4_A5162TipColLin ;
   private String[] P01TW5_A396EmprCod ;
   private byte[] P01TW5_A831TipColCod ;
   private String[] P01TW5_A5357TipColCla ;
   private boolean[] P01TW5_n5357TipColCla ;
   private String[] P01TW5_A764ProForCod ;
   private boolean[] P01TW5_n764ProForCod ;
   private short[] P01TW5_A5162TipColLin ;
   private String[] P01TW6_A396EmprCod ;
   private String[] P01TW6_A65ArtCod ;
   private int[] P01TW6_A252CliCod ;
   private short[] P01TW6_A829TipArtCod ;
}

final  class pxcoptct__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01TW2", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, MatCod, IntCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01TW3", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01TW4", "SELECT * FROM (SELECT EmprCod, TipColCod, TipColLin FROM TXPTIPCOP WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod, TipColLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01TW5", "SELECT EmprCod, TipColCod, TipColCla, ProForCod, TipColLin FROM TXPTIPCOP WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod, TipColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01TW6", "SELECT EmprCod, ArtCod, CliCod, TipArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 4 :
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
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

