package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cambiocoloresbloqueadosdeleteobservaciones extends GXProcedure
{
   public cambiocoloresbloqueadosdeleteobservaciones( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cambiocoloresbloqueadosdeleteobservaciones.class ), "" );
   }

   public cambiocoloresbloqueadosdeleteobservaciones( int remoteHandle ,
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
                        String aP6 ,
                        String aP7 ,
                        String aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 )
   {
      cambiocoloresbloqueadosdeleteobservaciones.this.AV11EMprcod = aP0;
      cambiocoloresbloqueadosdeleteobservaciones.this.AV8clicod = aP1;
      cambiocoloresbloqueadosdeleteobservaciones.this.AV15forser = aP2;
      cambiocoloresbloqueadosdeleteobservaciones.this.AV12forcolnom = aP3;
      cambiocoloresbloqueadosdeleteobservaciones.this.AV13forcolnum = aP4;
      cambiocoloresbloqueadosdeleteobservaciones.this.AV21tipcolcod = aP5;
      cambiocoloresbloqueadosdeleteobservaciones.this.AV29colores_json = aP6;
      cambiocoloresbloqueadosdeleteobservaciones.this.AV22usurcod = aP7;
      cambiocoloresbloqueadosdeleteobservaciones.this.AV19station = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Colores.fromJSonString(AV29colores_json, null);
      if ( AV10Colores.size() > 0 )
      {
         AV32GXV1 = 1 ;
         while ( AV32GXV1 <= AV10Colores.size() )
         {
            AV9Color = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV10Colores.elementAt(-1+AV32GXV1));
            AV23Vclicod = (int)(GXutil.lval( GXutil.substring( AV9Color.getgxTv_SdtMessages_Message_Id(), 1, 6))) ;
            AV24Vforser = GXutil.substring( AV9Color.getgxTv_SdtMessages_Message_Id(), 7, 16) ;
            AV25Vforcolnom = GXutil.substring( AV9Color.getgxTv_SdtMessages_Message_Id(), 23, 13) ;
            AV26Vforcolnum = (int)(GXutil.lval( GXutil.substring( AV9Color.getgxTv_SdtMessages_Message_Id(), 36, 6))) ;
            AV27Vtipcolcod = (byte)(GXutil.lval( GXutil.substring( AV9Color.getgxTv_SdtMessages_Message_Id(), 42, 2))) ;
            /* Optimized DELETE. */
            /* Using cursor P0AQK2 */
            pr_default.execute(0, new Object[] {AV11EMprcod, Integer.valueOf(AV23Vclicod), AV24Vforser, AV25Vforcolnom, Integer.valueOf(AV26Vforcolnum), Byte.valueOf(AV27Vtipcolcod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOBFOR");
            /* End optimized DELETE. */
            AV32GXV1 = (int)(AV32GXV1+1) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.cambiocoloresbloqueadosdeleteobservaciones");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Colores = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV9Color = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV24Vforser = "" ;
      AV25Vforcolnom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cambiocoloresbloqueadosdeleteobservaciones__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21tipcolcod ;
   private byte AV27Vtipcolcod ;
   private short Gx_err ;
   private int AV8clicod ;
   private int AV13forcolnum ;
   private int AV32GXV1 ;
   private int AV23Vclicod ;
   private int AV26Vforcolnum ;
   private String AV11EMprcod ;
   private String AV15forser ;
   private String AV12forcolnom ;
   private String AV22usurcod ;
   private String AV19station ;
   private String AV24Vforser ;
   private String AV25Vforcolnom ;
   private String AV29colores_json ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Colores ;
   private com.genexus.SdtMessages_Message AV9Color ;
}

final  class cambiocoloresbloqueadosdeleteobservaciones__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AQK2", "DELETE FROM TXPLOBFOR  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLOBFOR")
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
               return;
      }
   }

}

