package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptipcop extends GXProcedure
{
   public ptipcop( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptipcop.class ), "" );
   }

   public ptipcop( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             short[] aP6 )
   {
      ptipcop.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 )
   {
      ptipcop.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptipcop.this.AV15CliCod = aP1[0];
      this.aP1 = aP1;
      ptipcop.this.AV16ForSer = aP2[0];
      this.aP2 = aP2;
      ptipcop.this.AV17ForColNom = aP3[0];
      this.aP3 = aP3;
      ptipcop.this.AV18ForColNum = aP4[0];
      this.aP4 = aP4;
      ptipcop.this.AV19TipColCod = aP5[0];
      this.aP5 = aP5;
      ptipcop.this.AV20TipColUl = aP6[0];
      this.aP6 = aP6;
      ptipcop.this.AV22Si_act = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_line = 0 ;
      AV25ForUltLin = (short)(0) ;
      /* Using cursor P01L52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16ForSer, AV17ForColNom, Integer.valueOf(AV18ForColNum), Byte.valueOf(AV19TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P01L52_A831TipColCod[0] ;
         A483ForColNum = P01L52_A483ForColNum[0] ;
         A482ForColNom = P01L52_A482ForColNom[0] ;
         A494ForSer = P01L52_A494ForSer[0] ;
         A252CliCod = P01L52_A252CliCod[0] ;
         A1160ProForL = P01L52_A1160ProForL[0] ;
         A626MatCod = P01L52_A626MatCod[0] ;
         A583IntCod = P01L52_A583IntCod[0] ;
         A626MatCod = P01L52_A626MatCod[0] ;
         A583IntCod = P01L52_A583IntCod[0] ;
         AV26MatCod = A626MatCod ;
         AV27IntCod = A583IntCod ;
         /* Execute user subroutine: 'TIPART' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         Gx_line = (int)(Gx_line+1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( Gx_line > 0 )
      {
         AV22Si_act = httpContext.getMessage( "N", "") ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      Gx_line = 0 ;
      /* Optimized group. */
      /* Using cursor P01L53 */
      pr_default.execute(1, new Object[] {A396EmprCod, Byte.valueOf(AV19TipColCod)});
      Gx_line = P01L53_Gx_line[0] ;
      pr_default.close(1);
      Gx_line = (int)(Gx_line+Gx_line*1) ;
      /* End optimized group. */
      if ( Gx_line == 0 )
      {
         AV22Si_act = httpContext.getMessage( "N", "") ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV21F_pr = GXutil.space( (short)(1)) ;
      while ( ( GXutil.strcmp(AV21F_pr, httpContext.getMessage( "N", "")) != 0 ) && ( GXutil.strcmp(AV21F_pr, httpContext.getMessage( "S", "")) != 0 ) )
      {
      }
      if ( GXutil.strcmp(AV21F_pr, httpContext.getMessage( "S", "")) == 0 )
      {
         /* Using cursor P01L54 */
         pr_default.execute(2, new Object[] {A396EmprCod, Byte.valueOf(AV19TipColCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A764ProForCod = P01L54_A764ProForCod[0] ;
            n764ProForCod = P01L54_n764ProForCod[0] ;
            A831TipColCod = P01L54_A831TipColCod[0] ;
            A5163TipColUl = P01L54_A5163TipColUl[0] ;
            n5163TipColUl = P01L54_n5163TipColUl[0] ;
            A5357TipColCla = P01L54_A5357TipColCla[0] ;
            n5357TipColCla = P01L54_n5357TipColCla[0] ;
            A5162TipColLin = P01L54_A5162TipColLin[0] ;
            A5163TipColUl = P01L54_A5163TipColUl[0] ;
            n5163TipColUl = P01L54_n5163TipColUl[0] ;
            W831TipColCod = A831TipColCod ;
            AV20TipColUl = A5163TipColUl ;
            AV24Accion = "" ;
            AV23F_ctrl = (byte)(0) ;
            GXv_char1[0] = A396EmprCod ;
            GXv_char2[0] = " " ;
            GXv_char3[0] = A5357TipColCla ;
            GXv_int4[0] = AV23F_ctrl ;
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
            GXv_char18[0] = AV28Ant_ctrl ;
            GXv_int19[0] = AV29TipArtFor ;
            GXv_int20[0] = AV30Tipo_pza ;
            GXv_char21[0] = AV31BarAcc ;
            GXv_char22[0] = AV32BarAntpT ;
            new app.pclatc(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_int4, GXv_int5, GXv_char6, GXv_decimal7, GXv_char8, GXv_char9, GXv_int10, GXv_int11, GXv_char12, GXv_int13, GXv_char14, GXv_int15, GXv_int16, GXv_int17, GXv_char18, GXv_int19, GXv_int20, GXv_char21, GXv_char22) ;
            ptipcop.this.A396EmprCod = GXv_char1[0] ;
            ptipcop.this.A5357TipColCla = GXv_char3[0] ;
            ptipcop.this.AV23F_ctrl = GXv_int4[0] ;
            ptipcop.this.AV15CliCod = GXv_int5[0] ;
            ptipcop.this.AV16ForSer = GXv_char6[0] ;
            ptipcop.this.AV24Accion = GXv_char9[0] ;
            ptipcop.this.AV26MatCod = GXv_int13[0] ;
            ptipcop.this.AV17ForColNom = GXv_char14[0] ;
            ptipcop.this.AV18ForColNum = GXv_int15[0] ;
            ptipcop.this.AV19TipColCod = GXv_int16[0] ;
            ptipcop.this.AV27IntCod = GXv_int17[0] ;
            ptipcop.this.AV28Ant_ctrl = GXv_char18[0] ;
            ptipcop.this.AV29TipArtFor = GXv_int19[0] ;
            ptipcop.this.AV30Tipo_pza = GXv_int20[0] ;
            ptipcop.this.AV31BarAcc = GXv_char21[0] ;
            ptipcop.this.AV32BarAntpT = GXv_char22[0] ;
            if ( ( ( AV23F_ctrl == 1 ) && ! (GXutil.strcmp("", A5357TipColCla)==0) ) || (GXutil.strcmp("", A5357TipColCla)==0) )
            {
               Gx_msg = httpContext.getMessage( "&Accion    =", "") + AV24Accion + GXutil.newLine( ) + httpContext.getMessage( "TipColCla  =", "") + A5357TipColCla + GXutil.newLine( ) + httpContext.getMessage( "&ForUltLin =", "") + GXutil.str( AV25ForUltLin, 4, 0) ;
               if ( ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "M", "")) == 0 ) || ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "E", "")) == 0 ) )
               {
                  /* Execute user subroutine: 'LINEA_ANTERIOR' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     pr_default.close(2);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
               }
               if ( GXutil.strcmp(AV24Accion, httpContext.getMessage( "E", "")) != 0 )
               {
                  AV25ForUltLin = (short)(AV25ForUltLin+10) ;
                  /*
                     INSERT RECORD ON TABLE TXPLFORMU

                  */
                  W831TipColCod = A831TipColCod ;
                  A252CliCod = AV15CliCod ;
                  A494ForSer = AV16ForSer ;
                  A482ForColNom = AV17ForColNom ;
                  A483ForColNum = AV18ForColNum ;
                  A831TipColCod = AV19TipColCod ;
                  A1160ProForL = AV25ForUltLin ;
                  /* Using cursor P01L55 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL), Boolean.valueOf(n764ProForCod), A764ProForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
                  if ( (pr_default.getStatus(3) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  }
                  else
                  {
                     Gx_err = (short)(0) ;
                     Gx_emsg = "" ;
                  }
                  A831TipColCod = W831TipColCod ;
                  /* End Insert */
                  Application.commitDataStores(context, remoteHandle, pr_default, "ptipcop");
               }
            }
            AV20TipColUl = AV25ForUltLin ;
            A831TipColCod = W831TipColCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      AV22Si_act = AV21F_pr ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LINEA_ANTERIOR' Routine */
      returnInSub = false ;
      /* Optimized DELETE. */
      /* Using cursor P01L56 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16ForSer, AV17ForColNom, Integer.valueOf(AV18ForColNum), Byte.valueOf(AV19TipColCod), Short.valueOf(AV25ForUltLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
      /* End optimized DELETE. */
   }

   public void S121( )
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      /* Using cursor P01L57 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16ForSer});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A65ArtCod = P01L57_A65ArtCod[0] ;
         A252CliCod = P01L57_A252CliCod[0] ;
         A829TipArtCod = P01L57_A829TipArtCod[0] ;
         AV29TipArtFor = A829TipArtCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptipcop.this.A396EmprCod;
      this.aP1[0] = ptipcop.this.AV15CliCod;
      this.aP2[0] = ptipcop.this.AV16ForSer;
      this.aP3[0] = ptipcop.this.AV17ForColNom;
      this.aP4[0] = ptipcop.this.AV18ForColNum;
      this.aP5[0] = ptipcop.this.AV19TipColCod;
      this.aP6[0] = ptipcop.this.AV20TipColUl;
      this.aP7[0] = ptipcop.this.AV22Si_act;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptipcop");
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
      P01L52_A396EmprCod = new String[] {""} ;
      P01L52_A831TipColCod = new byte[1] ;
      P01L52_A483ForColNum = new int[1] ;
      P01L52_A482ForColNom = new String[] {""} ;
      P01L52_A494ForSer = new String[] {""} ;
      P01L52_A252CliCod = new int[1] ;
      P01L52_A1160ProForL = new short[1] ;
      P01L52_A626MatCod = new short[1] ;
      P01L52_A583IntCod = new byte[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      P01L53_Gx_line = new int[1] ;
      AV21F_pr = "" ;
      P01L54_A396EmprCod = new String[] {""} ;
      P01L54_A764ProForCod = new String[] {""} ;
      P01L54_n764ProForCod = new boolean[] {false} ;
      P01L54_A831TipColCod = new byte[1] ;
      P01L54_A5163TipColUl = new short[1] ;
      P01L54_n5163TipColUl = new boolean[] {false} ;
      P01L54_A5357TipColCla = new String[] {""} ;
      P01L54_n5357TipColCla = new boolean[] {false} ;
      P01L54_A5162TipColLin = new short[1] ;
      A764ProForCod = "" ;
      A5357TipColCla = "" ;
      AV24Accion = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new byte[1] ;
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
      AV28Ant_ctrl = "" ;
      GXv_char18 = new String[1] ;
      GXv_int19 = new short[1] ;
      GXv_int20 = new short[1] ;
      AV31BarAcc = "" ;
      GXv_char21 = new String[1] ;
      AV32BarAntpT = "" ;
      GXv_char22 = new String[1] ;
      Gx_msg = "" ;
      Gx_emsg = "" ;
      P01L57_A396EmprCod = new String[] {""} ;
      P01L57_A65ArtCod = new String[] {""} ;
      P01L57_A252CliCod = new int[1] ;
      P01L57_A829TipArtCod = new short[1] ;
      A65ArtCod = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ptipcop__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ptipcop__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ptipcop__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptipcop__default(),
         new Object[] {
             new Object[] {
            P01L52_A396EmprCod, P01L52_A831TipColCod, P01L52_A483ForColNum, P01L52_A482ForColNom, P01L52_A494ForSer, P01L52_A252CliCod, P01L52_A1160ProForL, P01L52_A626MatCod, P01L52_A583IntCod
            }
            , new Object[] {
            P01L53_Gx_line
            }
            , new Object[] {
            P01L54_A396EmprCod, P01L54_A764ProForCod, P01L54_n764ProForCod, P01L54_A831TipColCod, P01L54_A5163TipColUl, P01L54_n5163TipColUl, P01L54_A5357TipColCla, P01L54_n5357TipColCla, P01L54_A5162TipColLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01L57_A396EmprCod, P01L57_A65ArtCod, P01L57_A252CliCod, P01L57_A829TipArtCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19TipColCod ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV27IntCod ;
   private byte W831TipColCod ;
   private byte AV23F_ctrl ;
   private byte GXv_int4[] ;
   private byte GXv_int16[] ;
   private byte GXv_int17[] ;
   private short AV20TipColUl ;
   private short AV25ForUltLin ;
   private short A1160ProForL ;
   private short A626MatCod ;
   private short AV26MatCod ;
   private short A5163TipColUl ;
   private short A5162TipColLin ;
   private short GXv_int10[] ;
   private short GXv_int13[] ;
   private short AV29TipArtFor ;
   private short GXv_int19[] ;
   private short AV30Tipo_pza ;
   private short GXv_int20[] ;
   private short Gx_err ;
   private short A829TipArtCod ;
   private int AV15CliCod ;
   private int AV18ForColNum ;
   private int Gx_line ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int GXv_int5[] ;
   private int GXv_int11[] ;
   private int GXv_int15[] ;
   private int GX_INS154 ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String A396EmprCod ;
   private String AV16ForSer ;
   private String AV17ForColNom ;
   private String AV22Si_act ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String AV21F_pr ;
   private String A764ProForCod ;
   private String A5357TipColCla ;
   private String AV24Accion ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char6[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char12[] ;
   private String GXv_char14[] ;
   private String AV28Ant_ctrl ;
   private String GXv_char18[] ;
   private String AV31BarAcc ;
   private String GXv_char21[] ;
   private String AV32BarAntpT ;
   private String GXv_char22[] ;
   private String Gx_msg ;
   private String Gx_emsg ;
   private String A65ArtCod ;
   private boolean returnInSub ;
   private boolean n764ProForCod ;
   private boolean n5163TipColUl ;
   private boolean n5357TipColCla ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private short[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P01L52_A396EmprCod ;
   private byte[] P01L52_A831TipColCod ;
   private int[] P01L52_A483ForColNum ;
   private String[] P01L52_A482ForColNom ;
   private String[] P01L52_A494ForSer ;
   private int[] P01L52_A252CliCod ;
   private short[] P01L52_A1160ProForL ;
   private short[] P01L52_A626MatCod ;
   private byte[] P01L52_A583IntCod ;
   private int[] P01L53_Gx_line ;
   private String[] P01L54_A396EmprCod ;
   private String[] P01L54_A764ProForCod ;
   private boolean[] P01L54_n764ProForCod ;
   private byte[] P01L54_A831TipColCod ;
   private short[] P01L54_A5163TipColUl ;
   private boolean[] P01L54_n5163TipColUl ;
   private String[] P01L54_A5357TipColCla ;
   private boolean[] P01L54_n5357TipColCla ;
   private short[] P01L54_A5162TipColLin ;
   private String[] P01L57_A396EmprCod ;
   private String[] P01L57_A65ArtCod ;
   private int[] P01L57_A252CliCod ;
   private short[] P01L57_A829TipArtCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class ptipcop__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class ptipcop__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class ptipcop__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class ptipcop__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01L52", "SELECT T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.ProForL, T2.MatCod, T2.IntCod FROM (TXPLFORMU T1 INNER JOIN TXPCFORMU T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ForSer = T1.ForSer AND T2.ForColNom = T1.ForColNom AND T2.ForColNum = T1.ForColNum AND T2.TipColCod = T1.TipColCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01L53", "SELECT COUNT(*) FROM TXPTIPCOP WHERE EmprCod = ? and TipColCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01L54", "SELECT T1.EmprCod, T1.ProForCod, T1.TipColCod, T2.TipColUl, T1.TipColCla, T1.TipColLin FROM (TXPTIPCOP T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) WHERE T1.EmprCod = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.TipColCod, T1.TipColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01L55", "INSERT INTO TXPLFORMU(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL, ProForCod, ProForFR, ProFoNPrg, ProForrbn, ProForVol, ProForMq, ProForH2O, ProforFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
         ,new UpdateCursor("P01L56", "DELETE FROM TXPLFORMU  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ProForL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
         ,new ForEachCursor("P01L57", "SELECT EmprCod, ArtCod, CliCod, TipArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               return;
            case 5 :
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 6);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

