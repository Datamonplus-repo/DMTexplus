package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvxgrain extends GXProcedure
{
   public pvxgrain( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvxgrain.class ), "" );
   }

   public pvxgrain( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pvxgrain.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pvxgrain.this.AV10EmprCod = aP0[0];
      this.aP0 = aP0;
      pvxgrain.this.AV11BarCod = aP1[0];
      this.aP1 = aP1;
      pvxgrain.this.AV12BarCodReo = aP2[0];
      this.aP2 = aP2;
      pvxgrain.this.AV13BarcodPar = aP3[0];
      this.aP3 = aP3;
      pvxgrain.this.AV8BarpieCod = aP4[0];
      this.aP4 = aP4;
      pvxgrain.this.AV14PieHija = aP5[0];
      this.aP5 = aP5;
      pvxgrain.this.AV9VxTipMov = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV17NCLec ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int1) ;
      pvxgrain.this.AV17NCLec = GXv_int1[0] ;
      /*
         INSERT RECORD ON TABLE VTXTRINCACA

      */
      A11308AcFecMov = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n11308AcFecMov = false ;
      A11307AcTipMov = AV9VxTipMov ;
      n11307AcTipMov = false ;
      A11313AcEmprCod = AV10EmprCod ;
      n11313AcEmprCod = false ;
      A11309AcBarCod = AV11BarCod ;
      n11309AcBarCod = false ;
      A11310AcBarReo = AV12BarCodReo ;
      n11310AcBarReo = false ;
      A11311AcBarPar = AV13BarcodPar ;
      n11311AcBarPar = false ;
      A11314AcBarPie = AV8BarpieCod ;
      n11314AcBarPie = false ;
      A11315AcPieHija = AV14PieHija ;
      n11315AcPieHija = false ;
      A11312AcSitReg = (byte)(0) ;
      n11312AcSitReg = false ;
      /* Using cursor P02IK2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n11308AcFecMov), A11308AcFecMov, Boolean.valueOf(n11307AcTipMov), A11307AcTipMov, Boolean.valueOf(n11309AcBarCod), Integer.valueOf(A11309AcBarCod), Boolean.valueOf(n11310AcBarReo), Byte.valueOf(A11310AcBarReo), Boolean.valueOf(n11311AcBarPar), A11311AcBarPar, Boolean.valueOf(n11312AcSitReg), Byte.valueOf(A11312AcSitReg), Boolean.valueOf(n11313AcEmprCod), A11313AcEmprCod, Boolean.valueOf(n11314AcBarPie), A11314AcBarPie, Boolean.valueOf(n11315AcPieHija), A11315AcPieHija});
      /* Retrieving last key number assigned */
      /* Using cursor P02IK3 */
      pr_default.execute(1);
      A11306AcIdReg = P02IK3_A11306AcIdReg[0] ;
      pr_default.close(1);
      Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXTRINCACA");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         AV15MsgRet = AV20Pgmname + GXutil.newLine( ) + httpContext.getMessage( "No se pudo grabar incidencia en Vertex.", "") + GXutil.newLine( ) + httpContext.getMessage( "REGULARIZAR", "") ;
         httpContext.GX_msglist.addItem(AV15MsgRet);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      Application.commitDataStores(context, remoteHandle, pr_default, "pvxgrain");
      if ( AV17NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pvxgrain");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvxgrain.this.AV10EmprCod;
      this.aP1[0] = pvxgrain.this.AV11BarCod;
      this.aP2[0] = pvxgrain.this.AV12BarCodReo;
      this.aP3[0] = pvxgrain.this.AV13BarcodPar;
      this.aP4[0] = pvxgrain.this.AV8BarpieCod;
      this.aP5[0] = pvxgrain.this.AV14PieHija;
      this.aP6[0] = pvxgrain.this.AV9VxTipMov;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      A11308AcFecMov = GXutil.resetTime( GXutil.nullDate() );
      A11307AcTipMov = "" ;
      A11313AcEmprCod = "" ;
      A11311AcBarPar = "" ;
      A11314AcBarPie = "" ;
      A11315AcPieHija = "" ;
      Gx_emsg = "" ;
      scmdbuf = "" ;
      P02IK3_A11306AcIdReg = new int[1] ;
      AV15MsgRet = "" ;
      AV20Pgmname = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pvxgrain__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pvxgrain__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pvxgrain__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvxgrain__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P02IK3_A11306AcIdReg
            }
         }
      );
      AV20Pgmname = "PVXGraIn" ;
      /* GeneXus formulas. */
      AV20Pgmname = "PVXGraIn" ;
      Gx_err = (short)(0) ;
   }

   private byte AV12BarCodReo ;
   private byte AV17NCLec ;
   private byte GXv_int1[] ;
   private byte A11310AcBarReo ;
   private byte A11312AcSitReg ;
   private short Gx_err ;
   private int AV11BarCod ;
   private int GX_INS1510 ;
   private int A11309AcBarCod ;
   private int A11306AcIdReg ;
   private String AV10EmprCod ;
   private String AV13BarcodPar ;
   private String AV8BarpieCod ;
   private String AV14PieHija ;
   private String AV9VxTipMov ;
   private String A11307AcTipMov ;
   private String A11313AcEmprCod ;
   private String A11311AcBarPar ;
   private String A11314AcBarPie ;
   private String A11315AcPieHija ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private String AV15MsgRet ;
   private String AV20Pgmname ;
   private java.util.Date A11308AcFecMov ;
   private boolean n11308AcFecMov ;
   private boolean n11307AcTipMov ;
   private boolean n11313AcEmprCod ;
   private boolean n11309AcBarCod ;
   private boolean n11310AcBarReo ;
   private boolean n11311AcBarPar ;
   private boolean n11314AcBarPie ;
   private boolean n11315AcPieHija ;
   private boolean n11312AcSitReg ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private int[] P02IK3_A11306AcIdReg ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pvxgrain__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pvxgrain__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pvxgrain__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pvxgrain__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02IK2", "INSERT INTO VTXTRINCACA(IAFecMov, IATipMov, IABarCod, IABarReo, IABarPar, IASitReg, IAEmpCod, IABarPie, IaPieHija, IAFoColNu) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "VTXTRINCACA")
         ,new ForEachCursor("P02IK3", "SELECT IAIdReg.CURRVAL FROM DUAL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 3);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 9);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 9);
               }
               return;
      }
   }

}

