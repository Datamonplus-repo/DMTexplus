package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccdef1_rango extends GXProcedure
{
   public controlcalidad_ccdef1_rango( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccdef1_rango.class ), "" );
   }

   public controlcalidad_ccdef1_rango( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 )
   {
      controlcalidad_ccdef1_rango.this.A396EmprCod = aP0;
      controlcalidad_ccdef1_rango.this.A4031CCTCod = aP1;
      controlcalidad_ccdef1_rango.this.A4034CCTLin = aP2;
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
      A4049CCTValLin = (byte)(1) ;
      A4050CCTValDsc = httpContext.getMessage( "Minimo", "") ;
      A4051CCTVal = "" ;
      /* Using cursor P0APT2 */
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
      /*
         INSERT RECORD ON TABLE TXPCCDef2

      */
      A4049CCTValLin = (byte)(2) ;
      A4050CCTValDsc = httpContext.getMessage( "Maximo", "") ;
      A4051CCTVal = "" ;
      /* Using cursor P0APT3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Byte.valueOf(A4049CCTValLin), A4050CCTValDsc, A4051CCTVal});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
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
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidad_ccdef1_rango");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A4050CCTValDsc = "" ;
      A4051CCTVal = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccdef1_rango__default(),
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

   private byte A4049CCTValLin ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int A4031CCTCod ;
   private int GX_INS623 ;
   private String A396EmprCod ;
   private String A4050CCTValDsc ;
   private String A4051CCTVal ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
}

final  class controlcalidad_ccdef1_rango__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0APT2", "INSERT INTO TXPCCDef2(EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef2")
         ,new UpdateCursor("P0APT3", "INSERT INTO TXPCCDef2(EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef2")
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
            case 1 :
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

