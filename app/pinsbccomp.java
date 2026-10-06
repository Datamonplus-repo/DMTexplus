package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsbccomp extends GXProcedure
{
   public pinsbccomp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsbccomp.class ), "" );
   }

   public pinsbccomp( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            String[] aP2 ,
                            String[] aP3 ,
                            java.math.BigDecimal[] aP4 ,
                            java.math.BigDecimal[] aP5 ,
                            java.util.Date[] aP6 ,
                            String[] aP7 ,
                            String[] aP8 )
   {
      pinsbccomp.this.aP9 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.util.Date[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        short[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.util.Date[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 )
   {
      pinsbccomp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinsbccomp.this.AV9Prdnum = aP1[0];
      this.aP1 = aP1;
      pinsbccomp.this.AV16EntBnc = aP2[0];
      this.aP2 = aP2;
      pinsbccomp.this.AV12Albaran = aP3[0];
      this.aP3 = aP3;
      pinsbccomp.this.AV10EntPre = aP4[0];
      this.aP4 = aP4;
      pinsbccomp.this.AV8EntUniEnt = aP5[0];
      this.aP5 = aP5;
      pinsbccomp.this.AV11Fec1 = aP6[0];
      this.aP6 = aP6;
      pinsbccomp.this.AV13PrvNif = aP7[0];
      this.aP7 = aP7;
      pinsbccomp.this.AV14EntPedCum = aP8[0];
      this.aP8 = aP8;
      pinsbccomp.this.AV15LinEnt = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P06172 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV9Prdnum, Short.valueOf(AV15LinEnt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A597LinEnt = P06172_A597LinEnt[0] ;
         A719PrdNum = P06172_A719PrdNum[0] ;
         A10184EntRemTpo = P06172_A10184EntRemTpo[0] ;
         A10184EntRemTpo = httpContext.getMessage( "SI", "") ;
         /* Using cursor P06173 */
         pr_default.execute(1, new Object[] {A10184EntRemTpo, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /*
         INSERT RECORD ON TABLE TXPBCCOMP

      */
      A13488BCCPPedido = (int)(GXutil.lval( GXutil.trim( AV16EntBnc))) ;
      A13478BCProducto = AV9Prdnum ;
      A13489BCCPCantid = AV8EntUniEnt ;
      n13489BCCPCantid = false ;
      A13490BCCPPrecio = AV10EntPre ;
      n13490BCCPPrecio = false ;
      A13491BCCPFecRec = GXutil.resetTime(AV11Fec1) ;
      n13491BCCPFecRec = false ;
      A13492BCCPNalbar = AV12Albaran ;
      n13492BCCPNalbar = false ;
      A13493BCCPParcia = ((GXutil.strcmp(AV14EntPedCum, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "T", "") : httpContext.getMessage( "P", "")) ;
      n13493BCCPParcia = false ;
      A13494BCCPProvee = AV13PrvNif ;
      n13494BCCPProvee = false ;
      A13495BCCPProces = (short)(0) ;
      n13495BCCPProces = false ;
      A13496BCCPError = (short)(0) ;
      n13496BCCPError = false ;
      A13497BCCPDescEr = " " ;
      n13497BCCPDescEr = false ;
      A13498BCCPFecErr = GXutil.resetTime( GXutil.nullDate() );
      n13498BCCPFecErr = false ;
      A13499BCCPPilaEr = (short)(0) ;
      n13499BCCPPilaEr = false ;
      /* Using cursor P06174 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A13488BCCPPedido), A13478BCProducto, Boolean.valueOf(n13489BCCPCantid), A13489BCCPCantid, Boolean.valueOf(n13490BCCPPrecio), A13490BCCPPrecio, Boolean.valueOf(n13491BCCPFecRec), A13491BCCPFecRec, Boolean.valueOf(n13492BCCPNalbar), A13492BCCPNalbar, Boolean.valueOf(n13493BCCPParcia), A13493BCCPParcia, Boolean.valueOf(n13494BCCPProvee), A13494BCCPProvee, Boolean.valueOf(n13495BCCPProces), Short.valueOf(A13495BCCPProces), Boolean.valueOf(n13496BCCPError), Short.valueOf(A13496BCCPError), Boolean.valueOf(n13497BCCPDescEr), A13497BCCPDescEr, Boolean.valueOf(n13498BCCPFecErr), A13498BCCPFecErr, Boolean.valueOf(n13499BCCPPilaEr), Short.valueOf(A13499BCCPPilaEr)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBCCOMP");
      if ( (pr_default.getStatus(2) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinsbccomp.this.A396EmprCod;
      this.aP1[0] = pinsbccomp.this.AV9Prdnum;
      this.aP2[0] = pinsbccomp.this.AV16EntBnc;
      this.aP3[0] = pinsbccomp.this.AV12Albaran;
      this.aP4[0] = pinsbccomp.this.AV10EntPre;
      this.aP5[0] = pinsbccomp.this.AV8EntUniEnt;
      this.aP6[0] = pinsbccomp.this.AV11Fec1;
      this.aP7[0] = pinsbccomp.this.AV13PrvNif;
      this.aP8[0] = pinsbccomp.this.AV14EntPedCum;
      this.aP9[0] = pinsbccomp.this.AV15LinEnt;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinsbccomp");
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
      P06172_A396EmprCod = new String[] {""} ;
      P06172_A597LinEnt = new short[1] ;
      P06172_A719PrdNum = new String[] {""} ;
      P06172_A10184EntRemTpo = new String[] {""} ;
      A719PrdNum = "" ;
      A10184EntRemTpo = "" ;
      A13478BCProducto = "" ;
      A13489BCCPCantid = DecimalUtil.ZERO ;
      A13490BCCPPrecio = DecimalUtil.ZERO ;
      A13491BCCPFecRec = GXutil.nullDate() ;
      A13492BCCPNalbar = "" ;
      A13493BCCPParcia = "" ;
      A13494BCCPProvee = "" ;
      A13497BCCPDescEr = "" ;
      A13498BCCPFecErr = GXutil.resetTime( GXutil.nullDate() );
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinsbccomp__default(),
         new Object[] {
             new Object[] {
            P06172_A396EmprCod, P06172_A597LinEnt, P06172_A719PrdNum, P06172_A10184EntRemTpo
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV15LinEnt ;
   private short A597LinEnt ;
   private short A13495BCCPProces ;
   private short A13496BCCPError ;
   private short A13499BCCPPilaEr ;
   private short Gx_err ;
   private int GX_INS1845 ;
   private int A13488BCCPPedido ;
   private java.math.BigDecimal AV10EntPre ;
   private java.math.BigDecimal AV8EntUniEnt ;
   private java.math.BigDecimal A13489BCCPCantid ;
   private java.math.BigDecimal A13490BCCPPrecio ;
   private String A396EmprCod ;
   private String AV9Prdnum ;
   private String AV16EntBnc ;
   private String AV12Albaran ;
   private String AV13PrvNif ;
   private String AV14EntPedCum ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A10184EntRemTpo ;
   private String A13478BCProducto ;
   private String A13492BCCPNalbar ;
   private String A13493BCCPParcia ;
   private String A13494BCCPProvee ;
   private String Gx_emsg ;
   private java.util.Date AV11Fec1 ;
   private java.util.Date A13498BCCPFecErr ;
   private java.util.Date A13491BCCPFecRec ;
   private boolean n13489BCCPCantid ;
   private boolean n13490BCCPPrecio ;
   private boolean n13491BCCPFecRec ;
   private boolean n13492BCCPNalbar ;
   private boolean n13493BCCPParcia ;
   private boolean n13494BCCPProvee ;
   private boolean n13495BCCPProces ;
   private boolean n13496BCCPError ;
   private boolean n13497BCCPDescEr ;
   private boolean n13498BCCPFecErr ;
   private boolean n13499BCCPPilaEr ;
   private String A13497BCCPDescEr ;
   private short[] aP9 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.util.Date[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P06172_A396EmprCod ;
   private short[] P06172_A597LinEnt ;
   private String[] P06172_A719PrdNum ;
   private String[] P06172_A10184EntRemTpo ;
}

final  class pinsbccomp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06172", "SELECT EmprCod, LinEnt, PrdNum, EntRemTpo FROM TXPENTALM WHERE EmprCod = ? and PrdNum = ? and LinEnt = ? ORDER BY EmprCod, PrdNum, LinEnt ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P06173", "UPDATE TXPENTALM SET EntRemTpo=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new UpdateCursor("P06174", "INSERT INTO TXPBCCOMP(EmprCod, BCCPPedido, BCProducto, BCCPCantid, BCCPPrecio, BCCPFecRec, BCCPNalbar, BCCPParcia, BCCPProvee, BCCPProces, BCCPError, BCCPDescEr, BCCPFecErr, BCCPPilaEr) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBCCOMP")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 10);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 20);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 200);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[22], false);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[24]).shortValue());
               }
               return;
      }
   }

}

