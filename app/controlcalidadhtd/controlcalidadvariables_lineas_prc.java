package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidadvariables_lineas_prc extends GXProcedure
{
   public controlcalidadvariables_lineas_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidadvariables_lineas_prc.class ), "" );
   }

   public controlcalidadvariables_lineas_prc( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        String aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             String aP5 )
   {
      controlcalidadvariables_lineas_prc.this.AV13EmprCod = aP0;
      controlcalidadvariables_lineas_prc.this.AV8CCTCod = aP1;
      controlcalidadvariables_lineas_prc.this.AV9CCTLin = aP2;
      controlcalidadvariables_lineas_prc.this.AV10CCTValLin = aP3;
      controlcalidadvariables_lineas_prc.this.AV11CCTValDsc = aP4;
      controlcalidadvariables_lineas_prc.this.AV12CCTVal = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPCCDef2

      */
      A396EmprCod = AV13EmprCod ;
      A4031CCTCod = AV8CCTCod ;
      A4034CCTLin = AV9CCTLin ;
      A4049CCTValLin = AV10CCTValLin ;
      A4050CCTValDsc = AV11CCTValDsc ;
      A4051CCTVal = AV12CCTVal ;
      /* Using cursor P0AB92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin), A4050CCTValDsc, A4051CCTVal});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
      if ( (pr_default.getStatus(0) == 1) )
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
      Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidadvariables_lineas_prc");
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
      A4050CCTValDsc = "" ;
      A4051CCTVal = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadvariables_lineas_prc__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10CCTValLin ;
   private byte A4049CCTValLin ;
   private short AV9CCTLin ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int AV8CCTCod ;
   private int GX_INS623 ;
   private int A4031CCTCod ;
   private String AV13EmprCod ;
   private String AV11CCTValDsc ;
   private String AV12CCTVal ;
   private String A396EmprCod ;
   private String A4050CCTValDsc ;
   private String A4051CCTVal ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
}

final  class controlcalidadvariables_lineas_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AB92", "INSERT INTO TXPCCDef2(EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef2")
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 30);
               stmt.setString(6, (String)parms[5], 40);
               return;
      }
   }

}

