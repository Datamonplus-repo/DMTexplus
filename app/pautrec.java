package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pautrec extends GXProcedure
{
   public pautrec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pautrec.class ), "" );
   }

   public pautrec( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             byte[] aP9 ,
                             short[] aP10 )
   {
      pautrec.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        byte[] aP9 ,
                        short[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             byte[] aP9 ,
                             short[] aP10 ,
                             String[] aP11 )
   {
      pautrec.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pautrec.this.AV28XToOco = aP1[0];
      this.aP1 = aP1;
      pautrec.this.AV21XToOCoTpo = aP2[0];
      this.aP2 = aP2;
      pautrec.this.AV20XToOcoPrv = aP3[0];
      this.aP3 = aP3;
      pautrec.this.AV24XToOCoCliN = aP4[0];
      this.aP4 = aP4;
      pautrec.this.AV25XToOCoCru = aP5[0];
      this.aP5 = aP5;
      pautrec.this.AV26XToOCoPrdC = aP6[0];
      this.aP6 = aP6;
      pautrec.this.AV27XToOCoRep = aP7[0];
      this.aP7 = aP7;
      pautrec.this.AV19XToOCoCnt = aP8[0];
      this.aP8 = aP8;
      pautrec.this.AV23Ok = aP9[0];
      this.aP9 = aP9;
      pautrec.this.Gx_err = aP10[0];
      this.aP10 = aP10;
      pautrec.this.Gx_emsg = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Ok = (byte)(1) ;
      AV33Xtooconat = GXutil.trim( GXutil.substring( AV28XToOco, 1, 6)) ;
      AV29XToOCoCod = GXutil.trim( GXutil.substring( AV28XToOco, 8, 6)) ;
      AV30XToOCoItm = GXutil.trim( GXutil.substring( AV28XToOco, 15, 4)) ;
      AV34GXLvl5 = (byte)(0) ;
      /* Using cursor P01IH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV29XToOCoCod, AV30XToOCoItm, AV33Xtooconat});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10140XToOCoItm = P01IH2_A10140XToOCoItm[0] ;
         A10139XToOCoCod = P01IH2_A10139XToOCoCod[0] ;
         A10210XToOCoNat = P01IH2_A10210XToOCoNat[0] ;
         n10210XToOCoNat = P01IH2_n10210XToOCoNat[0] ;
         A10141XToOCoTpo = P01IH2_A10141XToOCoTpo[0] ;
         n10141XToOCoTpo = P01IH2_n10141XToOCoTpo[0] ;
         A10122GpoEcoCod = P01IH2_A10122GpoEcoCod[0] ;
         n10122GpoEcoCod = P01IH2_n10122GpoEcoCod[0] ;
         A10143XToOCoCru = P01IH2_A10143XToOCoCru[0] ;
         n10143XToOCoCru = P01IH2_n10143XToOCoCru[0] ;
         A10144XToOCoPrdC = P01IH2_A10144XToOCoPrdC[0] ;
         n10144XToOCoPrdC = P01IH2_n10144XToOCoPrdC[0] ;
         A10145XToOCoRep = P01IH2_A10145XToOCoRep[0] ;
         n10145XToOCoRep = P01IH2_n10145XToOCoRep[0] ;
         A10218XToOCoCnt = P01IH2_A10218XToOCoCnt[0] ;
         n10218XToOCoCnt = P01IH2_n10218XToOCoCnt[0] ;
         AV34GXLvl5 = (byte)(1) ;
         if ( AV23Ok == 1 )
         {
            if ( ! ( GXutil.strcmp(AV21XToOCoTpo, A10141XToOCoTpo) == 0 ) )
            {
               AV23Ok = (byte)(0) ;
               Gx_err = (short)(1) ;
               Gx_emsg = httpContext.getMessage( "No coincide el tipo de Orden de compra (", "") + AV21XToOCoTpo + "<>" + A10141XToOCoTpo + ")" ;
            }
         }
         if ( AV23Ok == 1 )
         {
            /* Execute user subroutine: 'GRUPOECONOMICO' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV22GpoEcoCod != A10122GpoEcoCod )
            {
               AV23Ok = (byte)(0) ;
               Gx_err = (short)(2) ;
               Gx_emsg = httpContext.getMessage( "No coincide el grupo económico (", "") + GXutil.trim( GXutil.str( AV22GpoEcoCod, 10, 0)) + "<>" + GXutil.trim( GXutil.str( A10122GpoEcoCod, 10, 0)) + ")" ;
            }
         }
         if ( AV23Ok == 1 )
         {
            if ( GXutil.strcmp(A10141XToOCoTpo, httpContext.getMessage( "H", "")) == 0 )
            {
               if ( ! ( ( AV25XToOCoCru == A10143XToOCoCru ) ) )
               {
                  AV23Ok = (byte)(0) ;
                  Gx_err = (short)(4) ;
                  Gx_emsg = httpContext.getMessage( "No coincide el crudo (", "") + GXutil.trim( GXutil.str( AV25XToOCoCru, 6, 0)) + "<>" + GXutil.trim( GXutil.str( A10143XToOCoCru, 6, 0)) + ")" ;
               }
            }
            else if ( GXutil.strcmp(A10141XToOCoTpo, httpContext.getMessage( "P", "")) == 0 )
            {
               if ( ! ( ( GXutil.strcmp(AV26XToOCoPrdC, A10144XToOCoPrdC) == 0 ) ) )
               {
                  AV23Ok = (byte)(0) ;
                  Gx_err = (short)(5) ;
                  Gx_emsg = httpContext.getMessage( "No coincide el producto (", "") + GXutil.trim( AV26XToOCoPrdC) + "<>" + GXutil.trim( A10144XToOCoPrdC) + ")" ;
               }
            }
            else if ( GXutil.strcmp(A10141XToOCoTpo, httpContext.getMessage( "R", "")) == 0 )
            {
               if ( ! ( ( AV27XToOCoRep == A10145XToOCoRep ) ) )
               {
                  AV23Ok = (byte)(0) ;
                  Gx_err = (short)(6) ;
                  Gx_emsg = httpContext.getMessage( "No coincide el repuesto (", "") + GXutil.trim( GXutil.str( AV27XToOCoRep, 10, 0)) + "<>" + GXutil.trim( GXutil.str( A10145XToOCoRep, 10, 0)) + ")" ;
               }
            }
            else
            {
               AV23Ok = (byte)(0) ;
               Gx_err = (short)(7) ;
               Gx_emsg = httpContext.getMessage( "Tipo de Orden (", "") + A10141XToOCoTpo + httpContext.getMessage( ") inválido", "") ;
            }
         }
         if ( AV23Ok == 1 )
         {
            if ( DecimalUtil.compareTo(AV19XToOCoCnt, A10218XToOCoCnt) > 0 )
            {
               AV23Ok = (byte)(0) ;
               Gx_err = (short)(7) ;
               Gx_emsg = httpContext.getMessage( "Cantidad supera lo autorizado (", "") + GXutil.trim( GXutil.str( AV19XToOCoCnt, 12, 2)) + " > " + GXutil.trim( GXutil.str( A10218XToOCoCnt, 12, 2)) + ")" ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV34GXLvl5 == 0 )
      {
         AV23Ok = (byte)(0) ;
         Gx_err = (short)(8) ;
         Gx_emsg = httpContext.getMessage( "1.Orden de Compra no encontrada (", "") + AV29XToOCoCod + "/" + AV30XToOCoItm + ")" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'GRUPOECONOMICO' Routine */
      returnInSub = false ;
      AV22GpoEcoCod = 0 ;
      if ( GXutil.strcmp(AV21XToOCoTpo, httpContext.getMessage( "H", "")) == 0 )
      {
         /* Using cursor P01IH3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV20XToOcoPrv)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A970ProceCod = P01IH3_A970ProceCod[0] ;
            A10122GpoEcoCod = P01IH3_A10122GpoEcoCod[0] ;
            n10122GpoEcoCod = P01IH3_n10122GpoEcoCod[0] ;
            AV22GpoEcoCod = A10122GpoEcoCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         /* Using cursor P01IH4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV20XToOcoPrv)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A795PrvNum = P01IH4_A795PrvNum[0] ;
            A10122GpoEcoCod = P01IH4_A10122GpoEcoCod[0] ;
            n10122GpoEcoCod = P01IH4_n10122GpoEcoCod[0] ;
            AV22GpoEcoCod = A10122GpoEcoCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pautrec.this.A396EmprCod;
      this.aP1[0] = pautrec.this.AV28XToOco;
      this.aP2[0] = pautrec.this.AV21XToOCoTpo;
      this.aP3[0] = pautrec.this.AV20XToOcoPrv;
      this.aP4[0] = pautrec.this.AV24XToOCoCliN;
      this.aP5[0] = pautrec.this.AV25XToOCoCru;
      this.aP6[0] = pautrec.this.AV26XToOCoPrdC;
      this.aP7[0] = pautrec.this.AV27XToOCoRep;
      this.aP8[0] = pautrec.this.AV19XToOCoCnt;
      this.aP9[0] = pautrec.this.AV23Ok;
      this.aP10[0] = pautrec.this.Gx_err;
      this.aP11[0] = pautrec.this.Gx_emsg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33Xtooconat = "" ;
      AV29XToOCoCod = "" ;
      AV30XToOCoItm = "" ;
      scmdbuf = "" ;
      P01IH2_A396EmprCod = new String[] {""} ;
      P01IH2_A10140XToOCoItm = new String[] {""} ;
      P01IH2_A10139XToOCoCod = new String[] {""} ;
      P01IH2_A10210XToOCoNat = new String[] {""} ;
      P01IH2_n10210XToOCoNat = new boolean[] {false} ;
      P01IH2_A10141XToOCoTpo = new String[] {""} ;
      P01IH2_n10141XToOCoTpo = new boolean[] {false} ;
      P01IH2_A10122GpoEcoCod = new int[1] ;
      P01IH2_n10122GpoEcoCod = new boolean[] {false} ;
      P01IH2_A10143XToOCoCru = new int[1] ;
      P01IH2_n10143XToOCoCru = new boolean[] {false} ;
      P01IH2_A10144XToOCoPrdC = new String[] {""} ;
      P01IH2_n10144XToOCoPrdC = new boolean[] {false} ;
      P01IH2_A10145XToOCoRep = new int[1] ;
      P01IH2_n10145XToOCoRep = new boolean[] {false} ;
      P01IH2_A10218XToOCoCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01IH2_n10218XToOCoCnt = new boolean[] {false} ;
      A10140XToOCoItm = "" ;
      A10139XToOCoCod = "" ;
      A10210XToOCoNat = "" ;
      A10141XToOCoTpo = "" ;
      A10144XToOCoPrdC = "" ;
      A10218XToOCoCnt = DecimalUtil.ZERO ;
      P01IH3_A396EmprCod = new String[] {""} ;
      P01IH3_A970ProceCod = new short[1] ;
      P01IH3_A10122GpoEcoCod = new int[1] ;
      P01IH3_n10122GpoEcoCod = new boolean[] {false} ;
      P01IH4_A396EmprCod = new String[] {""} ;
      P01IH4_A795PrvNum = new int[1] ;
      P01IH4_A10122GpoEcoCod = new int[1] ;
      P01IH4_n10122GpoEcoCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pautrec__default(),
         new Object[] {
             new Object[] {
            P01IH2_A396EmprCod, P01IH2_A10140XToOCoItm, P01IH2_A10139XToOCoCod, P01IH2_A10210XToOCoNat, P01IH2_n10210XToOCoNat, P01IH2_A10141XToOCoTpo, P01IH2_n10141XToOCoTpo, P01IH2_A10122GpoEcoCod, P01IH2_n10122GpoEcoCod, P01IH2_A10143XToOCoCru,
            P01IH2_n10143XToOCoCru, P01IH2_A10144XToOCoPrdC, P01IH2_n10144XToOCoPrdC, P01IH2_A10145XToOCoRep, P01IH2_n10145XToOCoRep, P01IH2_A10218XToOCoCnt, P01IH2_n10218XToOCoCnt
            }
            , new Object[] {
            P01IH3_A396EmprCod, P01IH3_A970ProceCod, P01IH3_A10122GpoEcoCod, P01IH3_n10122GpoEcoCod
            }
            , new Object[] {
            P01IH4_A396EmprCod, P01IH4_A795PrvNum, P01IH4_A10122GpoEcoCod, P01IH4_n10122GpoEcoCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV23Ok ;
   private byte AV34GXLvl5 ;
   private short Gx_err ;
   private short A970ProceCod ;
   private int AV20XToOcoPrv ;
   private int AV24XToOCoCliN ;
   private int AV25XToOCoCru ;
   private int AV27XToOCoRep ;
   private int A10122GpoEcoCod ;
   private int A10143XToOCoCru ;
   private int A10145XToOCoRep ;
   private int AV22GpoEcoCod ;
   private int A795PrvNum ;
   private java.math.BigDecimal AV19XToOCoCnt ;
   private java.math.BigDecimal A10218XToOCoCnt ;
   private String A396EmprCod ;
   private String AV28XToOco ;
   private String AV21XToOCoTpo ;
   private String AV26XToOCoPrdC ;
   private String Gx_emsg ;
   private String AV33Xtooconat ;
   private String AV29XToOCoCod ;
   private String AV30XToOCoItm ;
   private String scmdbuf ;
   private String A10140XToOCoItm ;
   private String A10139XToOCoCod ;
   private String A10210XToOCoNat ;
   private String A10141XToOCoTpo ;
   private String A10144XToOCoPrdC ;
   private boolean n10210XToOCoNat ;
   private boolean n10141XToOCoTpo ;
   private boolean n10122GpoEcoCod ;
   private boolean n10143XToOCoCru ;
   private boolean n10144XToOCoPrdC ;
   private boolean n10145XToOCoRep ;
   private boolean n10218XToOCoCnt ;
   private boolean returnInSub ;
   private String[] aP11 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private int[] aP4 ;
   private int[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private byte[] aP9 ;
   private short[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P01IH2_A396EmprCod ;
   private String[] P01IH2_A10140XToOCoItm ;
   private String[] P01IH2_A10139XToOCoCod ;
   private String[] P01IH2_A10210XToOCoNat ;
   private boolean[] P01IH2_n10210XToOCoNat ;
   private String[] P01IH2_A10141XToOCoTpo ;
   private boolean[] P01IH2_n10141XToOCoTpo ;
   private int[] P01IH2_A10122GpoEcoCod ;
   private boolean[] P01IH2_n10122GpoEcoCod ;
   private int[] P01IH2_A10143XToOCoCru ;
   private boolean[] P01IH2_n10143XToOCoCru ;
   private String[] P01IH2_A10144XToOCoPrdC ;
   private boolean[] P01IH2_n10144XToOCoPrdC ;
   private int[] P01IH2_A10145XToOCoRep ;
   private boolean[] P01IH2_n10145XToOCoRep ;
   private java.math.BigDecimal[] P01IH2_A10218XToOCoCnt ;
   private boolean[] P01IH2_n10218XToOCoCnt ;
   private String[] P01IH3_A396EmprCod ;
   private short[] P01IH3_A970ProceCod ;
   private int[] P01IH3_A10122GpoEcoCod ;
   private boolean[] P01IH3_n10122GpoEcoCod ;
   private String[] P01IH4_A396EmprCod ;
   private int[] P01IH4_A795PrvNum ;
   private int[] P01IH4_A10122GpoEcoCod ;
   private boolean[] P01IH4_n10122GpoEcoCod ;
}

final  class pautrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01IH2", "SELECT EmprCod, XToOCoItm, XToOCoCod, XToOCoNat, XToOCoTpo, GpoEcoCod, XToOCoCru, XToOCoPrdC, XToOCoRep, XToOCoCnt FROM TXPXToOCo WHERE (EmprCod = ? and XToOCoCod = ? and XToOCoItm = ?) AND (XToOCoNat = ?) ORDER BY EmprCod, XToOCoCod, XToOCoItm ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01IH3", "SELECT EmprCod, ProceCod, GpoEcoCod FROM TXPPROCED WHERE EmprCod = ? and ProceCod = ? ORDER BY EmprCod, ProceCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01IH4", "SELECT EmprCod, PrvNum, GpoEcoCod FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

