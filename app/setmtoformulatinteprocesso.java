package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class setmtoformulatinteprocesso extends GXProcedure
{
   public setmtoformulatinteprocesso( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( setmtoformulatinteprocesso.class ), "" );
   }

   public setmtoformulatinteprocesso( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        short aP6 ,
                        String aP7 ,
                        String aP8 ,
                        java.math.BigDecimal aP9 ,
                        java.math.BigDecimal aP10 ,
                        int aP11 ,
                        java.math.BigDecimal aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             short aP6 ,
                             String aP7 ,
                             String aP8 ,
                             java.math.BigDecimal aP9 ,
                             java.math.BigDecimal aP10 ,
                             int aP11 ,
                             java.math.BigDecimal aP12 )
   {
      setmtoformulatinteprocesso.this.AV8EmprCod = aP0;
      setmtoformulatinteprocesso.this.AV11CliCod = aP1;
      setmtoformulatinteprocesso.this.AV12ForSer = aP2;
      setmtoformulatinteprocesso.this.AV13ForColNom = aP3;
      setmtoformulatinteprocesso.this.AV14ForColNum = aP4;
      setmtoformulatinteprocesso.this.AV9TipColCod = aP5;
      setmtoformulatinteprocesso.this.AV10ProForL = aP6;
      setmtoformulatinteprocesso.this.AV15ProForCod = aP7;
      setmtoformulatinteprocesso.this.AV16ProForFR = aP8;
      setmtoformulatinteprocesso.this.AV17ProForrbn = aP9;
      setmtoformulatinteprocesso.this.AV18ProforFabs = aP10;
      setmtoformulatinteprocesso.this.AV19ProFoNPrg = aP11;
      setmtoformulatinteprocesso.this.AV21ForRelBan = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPLFORMU

      */
      A396EmprCod = AV8EmprCod ;
      A252CliCod = AV11CliCod ;
      A494ForSer = AV12ForSer ;
      A482ForColNom = AV13ForColNom ;
      A483ForColNum = AV14ForColNum ;
      A831TipColCod = AV9TipColCod ;
      A1160ProForL = AV10ProForL ;
      A764ProForCod = AV15ProForCod ;
      A6549ProForFR = AV16ProForFR ;
      A7802ProFoNPrg = AV19ProFoNPrg ;
      A8656ProForrbn = AV17ProForrbn ;
      A10542ProForH2O = (short)(1) ;
      A14198ProforFabs = AV18ProforFabs ;
      /* Using cursor P0ADK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL), A764ProForCod, A6549ProForFR, Integer.valueOf(A7802ProFoNPrg), A8656ProForrbn, Short.valueOf(A10542ProForH2O), A14198ProforFabs});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Optimized UPDATE. */
         /* Using cursor P0ADK3 */
         pr_default.execute(1, new Object[] {AV18ProforFabs, AV17ProForrbn, Integer.valueOf(AV19ProFoNPrg), AV16ProForFR, AV15ProForCod, AV8EmprCod, Integer.valueOf(AV11CliCod), AV12ForSer, AV13ForColNom, Integer.valueOf(AV14ForColNum), Byte.valueOf(AV9TipColCod), Short.valueOf(AV10ProForL)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      Application.commitDataStores(context, remoteHandle, pr_default, "setmtoformulatinteprocesso");
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A764ProForCod = "" ;
      A6549ProForFR = "" ;
      A8656ProForrbn = DecimalUtil.ZERO ;
      A14198ProforFabs = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.setmtoformulatinteprocesso__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.setmtoformulatinteprocesso__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.setmtoformulatinteprocesso__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.setmtoformulatinteprocesso__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9TipColCod ;
   private byte A831TipColCod ;
   private short AV10ProForL ;
   private short A1160ProForL ;
   private short A10542ProForH2O ;
   private short Gx_err ;
   private int AV11CliCod ;
   private int AV14ForColNum ;
   private int AV19ProFoNPrg ;
   private int GX_INS154 ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A7802ProFoNPrg ;
   private java.math.BigDecimal AV17ProForrbn ;
   private java.math.BigDecimal AV18ProforFabs ;
   private java.math.BigDecimal AV21ForRelBan ;
   private java.math.BigDecimal A8656ProForrbn ;
   private java.math.BigDecimal A14198ProforFabs ;
   private String AV8EmprCod ;
   private String AV12ForSer ;
   private String AV13ForColNom ;
   private String AV15ProForCod ;
   private String AV16ProForFR ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A764ProForCod ;
   private String A6549ProForFR ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class setmtoformulatinteprocesso__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class setmtoformulatinteprocesso__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class setmtoformulatinteprocesso__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class setmtoformulatinteprocesso__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0ADK2", "INSERT INTO TXPLFORMU(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL, ProForCod, ProForFR, ProFoNPrg, ProForrbn, ProForH2O, ProforFabs, ProForVol, ProForMq) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
         ,new UpdateCursor("P0ADK3", "UPDATE TXPLFORMU SET ProforFabs=?, ProForrbn=?, ProFoNPrg=?, ProForFR=?, ProForCod=?  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ProForL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 13);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
      }
   }

}

