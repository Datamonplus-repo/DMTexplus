package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpenmd_insupd extends GXProcedure
{
   public tpenmd_insupd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpenmd_insupd.class ), "" );
   }

   public tpenmd_insupd( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        java.math.BigDecimal aP3 ,
                        java.math.BigDecimal aP4 ,
                        java.math.BigDecimal aP5 ,
                        java.math.BigDecimal aP6 ,
                        java.math.BigDecimal aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             java.math.BigDecimal aP3 ,
                             java.math.BigDecimal aP4 ,
                             java.math.BigDecimal aP5 ,
                             java.math.BigDecimal aP6 ,
                             java.math.BigDecimal aP7 )
   {
      tpenmd_insupd.this.A396EmprCod = aP0;
      tpenmd_insupd.this.A252CliCod = aP1;
      tpenmd_insupd.this.AV8PMDLin = aP2;
      tpenmd_insupd.this.AV9PMDKgmMax = aP3;
      tpenmd_insupd.this.AV10PMDKgmMin = aP4;
      tpenmd_insupd.this.AV11PMDTinPrc = aP5;
      tpenmd_insupd.this.AV12PMDAcaPrc = aP6;
      tpenmd_insupd.this.AV13PMDKgmMinS = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16GXLvl5 = (byte)(0) ;
      /* Optimized UPDATE. */
      /* Using cursor P0AMS2 */
      pr_default.execute(0, new Object[] {AV11PMDTinPrc, AV13PMDKgmMinS, AV10PMDKgmMin, AV9PMDKgmMax, AV12PMDAcaPrc, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(AV8PMDLin)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV16GXLvl5 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPenMD");
      /* End optimized UPDATE. */
      if ( AV16GXLvl5 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPPenMD

         */
         A8403PMDLin = AV8PMDLin ;
         A8407PMDAcaPrc = AV12PMDAcaPrc ;
         A8405PMDKgmMax = AV9PMDKgmMax ;
         A8404PMDKgmMin = AV10PMDKgmMin ;
         A8408PMDKgmMinS = AV13PMDKgmMinS ;
         A8406PMDTinPrc = AV11PMDTinPrc ;
         /* Using cursor P0AMS3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8403PMDLin), A8404PMDKgmMin, A8405PMDKgmMax, A8406PMDTinPrc, A8407PMDAcaPrc, A8408PMDKgmMinS});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPenMD");
         if ( (pr_default.getStatus(1) == 1) )
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
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.tpenmd_insupd");
      /* Using cursor P0AMS4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A8403PMDLin = P0AMS4_A8403PMDLin[0] ;
         AV8PMDLin = A8403PMDLin ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      n8402PMDLinUlt = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0AMS5 */
      int AV8PMDLin8402Aux;
      AV8PMDLin8402Aux = AV8PMDLin ;
      pr_default.execute(3, new Object[] {Boolean.valueOf(n8402PMDLinUlt), Integer.valueOf(AV8PMDLin8402Aux), A396EmprCod, Integer.valueOf(A252CliCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.tpenmd_insupd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A8406PMDTinPrc = DecimalUtil.ZERO ;
      A8408PMDKgmMinS = DecimalUtil.ZERO ;
      A8404PMDKgmMin = DecimalUtil.ZERO ;
      A8405PMDKgmMax = DecimalUtil.ZERO ;
      A8407PMDAcaPrc = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      scmdbuf = "" ;
      P0AMS4_A396EmprCod = new String[] {""} ;
      P0AMS4_A252CliCod = new int[1] ;
      P0AMS4_A8403PMDLin = new short[1] ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd_insupd__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd_insupd__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd_insupd__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd_insupd__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P0AMS4_A396EmprCod, P0AMS4_A252CliCod, P0AMS4_A8403PMDLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16GXLvl5 ;
   private short AV8PMDLin ;
   private short A8403PMDLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int GX_INS1160 ;
   private int A8402PMDLinUlt ;
   private java.math.BigDecimal AV9PMDKgmMax ;
   private java.math.BigDecimal AV10PMDKgmMin ;
   private java.math.BigDecimal AV11PMDTinPrc ;
   private java.math.BigDecimal AV12PMDAcaPrc ;
   private java.math.BigDecimal AV13PMDKgmMinS ;
   private java.math.BigDecimal A8406PMDTinPrc ;
   private java.math.BigDecimal A8408PMDKgmMinS ;
   private java.math.BigDecimal A8404PMDKgmMin ;
   private java.math.BigDecimal A8405PMDKgmMax ;
   private java.math.BigDecimal A8407PMDAcaPrc ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private boolean n8402PMDLinUlt ;
   private IDataStoreProvider pr_default ;
   private String[] P0AMS4_A396EmprCod ;
   private int[] P0AMS4_A252CliCod ;
   private short[] P0AMS4_A8403PMDLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class tpenmd_insupd__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpenmd_insupd__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpenmd_insupd__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpenmd_insupd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AMS2", "UPDATE TXPPenMD SET PMDTinPrc=?, PMDKgmMinS=?, PMDKgmMin=?, PMDKgmMax=?, PMDAcaPrc=?  WHERE EmprCod = ? and CliCod = ? and PMDLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPenMD")
         ,new UpdateCursor("P0AMS3", "INSERT INTO TXPPenMD(EmprCod, CliCod, PMDLin, PMDKgmMin, PMDKgmMax, PMDTinPrc, PMDAcaPrc, PMDKgmMinS) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPenMD")
         ,new ForEachCursor("P0AMS4", "SELECT EmprCod, CliCod, PMDLin FROM TXPPenMD WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, PMDLin DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AMS5", "UPDATE TXPCLIENT SET PMDLinUlt=?  WHERE EmprCod = ? and CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENT")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

