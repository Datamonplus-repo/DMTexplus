package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkilrec extends GXProcedure
{
   public pkilrec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkilrec.class ), "" );
   }

   public pkilrec( int remoteHandle ,
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
                             String[] aP5 ,
                             int[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             byte[] aP9 ,
                             short[] aP10 )
   {
      pkilrec.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
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
                             String[] aP5 ,
                             int[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             byte[] aP9 ,
                             short[] aP10 ,
                             String[] aP11 )
   {
      pkilrec.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkilrec.this.AV17XToOCo = aP1[0];
      this.aP1 = aP1;
      pkilrec.this.AV23XToOcoTpo = aP2[0];
      this.aP2 = aP2;
      pkilrec.this.AV24XToOCoCliN = aP3[0];
      this.aP3 = aP3;
      pkilrec.this.AV25XToOCoCru = aP4[0];
      this.aP4 = aP4;
      pkilrec.this.AV26XToOCoPrdC = aP5[0];
      this.aP5 = aP5;
      pkilrec.this.AV27XToOCoRep = aP6[0];
      this.aP6 = aP6;
      pkilrec.this.AV18oKilEnt = aP7[0];
      this.aP7 = aP7;
      pkilrec.this.AV19KilEnt = aP8[0];
      this.aP8 = aP8;
      pkilrec.this.AV22Ok = aP9[0];
      this.aP9 = aP9;
      pkilrec.this.Gx_err = aP10[0];
      this.aP10 = aP10;
      pkilrec.this.Gx_emsg = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Ok = (byte)(1) ;
      AV28XToOCoNat = GXutil.trim( GXutil.substring( AV17XToOCo, 1, 6)) ;
      AV20XToOCoCod = GXutil.trim( GXutil.substring( AV17XToOCo, 8, 6)) ;
      AV21XToOCoItm = GXutil.trim( GXutil.substring( AV17XToOCo, 15, 4)) ;
      AV31GXLvl5 = (byte)(0) ;
      /* Using cursor P017F2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV20XToOCoCod, AV21XToOCoItm, AV28XToOCoNat});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10140XToOCoItm = P017F2_A10140XToOCoItm[0] ;
         A10139XToOCoCod = P017F2_A10139XToOCoCod[0] ;
         A10210XToOCoNat = P017F2_A10210XToOCoNat[0] ;
         n10210XToOCoNat = P017F2_n10210XToOCoNat[0] ;
         A10141XToOCoTpo = P017F2_A10141XToOCoTpo[0] ;
         n10141XToOCoTpo = P017F2_n10141XToOCoTpo[0] ;
         A10143XToOCoCru = P017F2_A10143XToOCoCru[0] ;
         n10143XToOCoCru = P017F2_n10143XToOCoCru[0] ;
         A10144XToOCoPrdC = P017F2_A10144XToOCoPrdC[0] ;
         n10144XToOCoPrdC = P017F2_n10144XToOCoPrdC[0] ;
         A10145XToOCoRep = P017F2_A10145XToOCoRep[0] ;
         n10145XToOCoRep = P017F2_n10145XToOCoRep[0] ;
         A10218XToOCoCnt = P017F2_A10218XToOCoCnt[0] ;
         n10218XToOCoCnt = P017F2_n10218XToOCoCnt[0] ;
         AV31GXLvl5 = (byte)(1) ;
         if ( AV22Ok == 1 )
         {
            if ( ! ( GXutil.strcmp(AV23XToOcoTpo, A10141XToOCoTpo) == 0 ) )
            {
               AV22Ok = (byte)(0) ;
               Gx_err = (short)(1) ;
               Gx_emsg = httpContext.getMessage( "No coincide el tipo de Orden de compra (", "") + AV23XToOcoTpo + "<>" + A10141XToOCoTpo + ")" ;
            }
         }
         if ( AV22Ok == 1 )
         {
            if ( GXutil.strcmp(A10141XToOCoTpo, httpContext.getMessage( "H", "")) == 0 )
            {
               if ( ! ( ( AV25XToOCoCru == A10143XToOCoCru ) ) )
               {
                  AV22Ok = (byte)(0) ;
                  Gx_err = (short)(3) ;
                  Gx_emsg = httpContext.getMessage( "No coincide el crudo (", "") + GXutil.trim( GXutil.str( AV25XToOCoCru, 6, 0)) + "<>" + GXutil.trim( GXutil.str( A10143XToOCoCru, 6, 0)) + ")" ;
               }
            }
            else if ( GXutil.strcmp(A10141XToOCoTpo, httpContext.getMessage( "P", "")) == 0 )
            {
               if ( ! ( ( GXutil.strcmp(AV26XToOCoPrdC, A10144XToOCoPrdC) == 0 ) ) )
               {
                  AV22Ok = (byte)(0) ;
                  Gx_err = (short)(4) ;
                  Gx_emsg = httpContext.getMessage( "No coincide el producto (", "") + GXutil.trim( AV26XToOCoPrdC) + "<>" + GXutil.trim( A10144XToOCoPrdC) + ")" ;
               }
            }
            else if ( GXutil.strcmp(A10141XToOCoTpo, httpContext.getMessage( "R", "")) == 0 )
            {
               if ( ! ( ( AV27XToOCoRep == A10145XToOCoRep ) ) )
               {
                  AV22Ok = (byte)(0) ;
                  Gx_err = (short)(5) ;
                  Gx_emsg = httpContext.getMessage( "No coincide el repuesto (", "") + GXutil.trim( GXutil.str( AV27XToOCoRep, 10, 0)) + "<>" + GXutil.trim( GXutil.str( A10145XToOCoRep, 10, 0)) + ")" ;
               }
            }
            else
            {
               AV22Ok = (byte)(0) ;
               Gx_err = (short)(6) ;
               Gx_emsg = httpContext.getMessage( "Tipo de Orden (", "") + A10141XToOCoTpo + httpContext.getMessage( ") inválido", "") ;
            }
         }
         if ( AV22Ok == 1 )
         {
            A10218XToOCoCnt = A10218XToOCoCnt.subtract(((AV19KilEnt.subtract(AV18oKilEnt)))) ;
            n10218XToOCoCnt = false ;
         }
         /* Using cursor P017F3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n10218XToOCoCnt), A10218XToOCoCnt, A396EmprCod, A10139XToOCoCod, A10140XToOCoItm});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXToOCo");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV31GXLvl5 == 0 )
      {
         AV22Ok = (byte)(0) ;
         Gx_err = (short)(7) ;
         Gx_emsg = httpContext.getMessage( "Orden de Compra no encontrada (", "") + AV20XToOCoCod + "/" + AV21XToOCoItm + ")" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkilrec.this.A396EmprCod;
      this.aP1[0] = pkilrec.this.AV17XToOCo;
      this.aP2[0] = pkilrec.this.AV23XToOcoTpo;
      this.aP3[0] = pkilrec.this.AV24XToOCoCliN;
      this.aP4[0] = pkilrec.this.AV25XToOCoCru;
      this.aP5[0] = pkilrec.this.AV26XToOCoPrdC;
      this.aP6[0] = pkilrec.this.AV27XToOCoRep;
      this.aP7[0] = pkilrec.this.AV18oKilEnt;
      this.aP8[0] = pkilrec.this.AV19KilEnt;
      this.aP9[0] = pkilrec.this.AV22Ok;
      this.aP10[0] = pkilrec.this.Gx_err;
      this.aP11[0] = pkilrec.this.Gx_emsg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28XToOCoNat = "" ;
      AV20XToOCoCod = "" ;
      AV21XToOCoItm = "" ;
      scmdbuf = "" ;
      P017F2_A396EmprCod = new String[] {""} ;
      P017F2_A10140XToOCoItm = new String[] {""} ;
      P017F2_A10139XToOCoCod = new String[] {""} ;
      P017F2_A10210XToOCoNat = new String[] {""} ;
      P017F2_n10210XToOCoNat = new boolean[] {false} ;
      P017F2_A10141XToOCoTpo = new String[] {""} ;
      P017F2_n10141XToOCoTpo = new boolean[] {false} ;
      P017F2_A10143XToOCoCru = new int[1] ;
      P017F2_n10143XToOCoCru = new boolean[] {false} ;
      P017F2_A10144XToOCoPrdC = new String[] {""} ;
      P017F2_n10144XToOCoPrdC = new boolean[] {false} ;
      P017F2_A10145XToOCoRep = new int[1] ;
      P017F2_n10145XToOCoRep = new boolean[] {false} ;
      P017F2_A10218XToOCoCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P017F2_n10218XToOCoCnt = new boolean[] {false} ;
      A10140XToOCoItm = "" ;
      A10139XToOCoCod = "" ;
      A10210XToOCoNat = "" ;
      A10141XToOCoTpo = "" ;
      A10144XToOCoPrdC = "" ;
      A10218XToOCoCnt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkilrec__default(),
         new Object[] {
             new Object[] {
            P017F2_A396EmprCod, P017F2_A10140XToOCoItm, P017F2_A10139XToOCoCod, P017F2_A10210XToOCoNat, P017F2_n10210XToOCoNat, P017F2_A10141XToOCoTpo, P017F2_n10141XToOCoTpo, P017F2_A10143XToOCoCru, P017F2_n10143XToOCoCru, P017F2_A10144XToOCoPrdC,
            P017F2_n10144XToOCoPrdC, P017F2_A10145XToOCoRep, P017F2_n10145XToOCoRep, P017F2_A10218XToOCoCnt, P017F2_n10218XToOCoCnt
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22Ok ;
   private byte AV31GXLvl5 ;
   private short Gx_err ;
   private int AV24XToOCoCliN ;
   private int AV25XToOCoCru ;
   private int AV27XToOCoRep ;
   private int A10143XToOCoCru ;
   private int A10145XToOCoRep ;
   private java.math.BigDecimal AV18oKilEnt ;
   private java.math.BigDecimal AV19KilEnt ;
   private java.math.BigDecimal A10218XToOCoCnt ;
   private String A396EmprCod ;
   private String AV17XToOCo ;
   private String AV23XToOcoTpo ;
   private String AV26XToOCoPrdC ;
   private String Gx_emsg ;
   private String AV28XToOCoNat ;
   private String AV20XToOCoCod ;
   private String AV21XToOCoItm ;
   private String scmdbuf ;
   private String A10140XToOCoItm ;
   private String A10139XToOCoCod ;
   private String A10210XToOCoNat ;
   private String A10141XToOCoTpo ;
   private String A10144XToOCoPrdC ;
   private boolean n10210XToOCoNat ;
   private boolean n10141XToOCoTpo ;
   private boolean n10143XToOCoCru ;
   private boolean n10144XToOCoPrdC ;
   private boolean n10145XToOCoRep ;
   private boolean n10218XToOCoCnt ;
   private String[] aP11 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private byte[] aP9 ;
   private short[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P017F2_A396EmprCod ;
   private String[] P017F2_A10140XToOCoItm ;
   private String[] P017F2_A10139XToOCoCod ;
   private String[] P017F2_A10210XToOCoNat ;
   private boolean[] P017F2_n10210XToOCoNat ;
   private String[] P017F2_A10141XToOCoTpo ;
   private boolean[] P017F2_n10141XToOCoTpo ;
   private int[] P017F2_A10143XToOCoCru ;
   private boolean[] P017F2_n10143XToOCoCru ;
   private String[] P017F2_A10144XToOCoPrdC ;
   private boolean[] P017F2_n10144XToOCoPrdC ;
   private int[] P017F2_A10145XToOCoRep ;
   private boolean[] P017F2_n10145XToOCoRep ;
   private java.math.BigDecimal[] P017F2_A10218XToOCoCnt ;
   private boolean[] P017F2_n10218XToOCoCnt ;
}

final  class pkilrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P017F2", "SELECT EmprCod, XToOCoItm, XToOCoCod, XToOCoNat, XToOCoTpo, XToOCoCru, XToOCoPrdC, XToOCoRep, XToOCoCnt FROM TXPXToOCo WHERE (EmprCod = ? and XToOCoCod = ? and XToOCoItm = ?) AND (XToOCoNat = ?) ORDER BY EmprCod, XToOCoCod, XToOCoItm ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P017F3", "UPDATE TXPXToOCo SET XToOCoCnt=?  WHERE EmprCod = ? AND XToOCoCod = ? AND XToOCoItm = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPXToOCo")
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
               ((String[]) buf[9])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setString(4, (String)parms[4], 4);
               return;
      }
   }

}

