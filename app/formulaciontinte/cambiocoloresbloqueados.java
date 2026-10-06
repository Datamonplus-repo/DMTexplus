package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cambiocoloresbloqueados extends GXProcedure
{
   public cambiocoloresbloqueados( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cambiocoloresbloqueados.class ), "" );
   }

   public cambiocoloresbloqueados( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        String aP3 ,
                        String aP4 ,
                        int aP5 ,
                        byte aP6 ,
                        String aP7 ,
                        String aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             String aP3 ,
                             String aP4 ,
                             int aP5 ,
                             byte aP6 ,
                             String aP7 ,
                             String aP8 )
   {
      cambiocoloresbloqueados.this.AV11EMprcod = aP0;
      cambiocoloresbloqueados.this.AV14ForNumCol = aP1;
      cambiocoloresbloqueados.this.AV8clicod = aP2;
      cambiocoloresbloqueados.this.AV15forser = aP3;
      cambiocoloresbloqueados.this.AV12forcolnom = aP4;
      cambiocoloresbloqueados.this.AV13forcolnum = aP5;
      cambiocoloresbloqueados.this.AV21tipcolcod = aP6;
      cambiocoloresbloqueados.this.AV22usurcod = aP7;
      cambiocoloresbloqueados.this.AV19station = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16inc_obs = " " ;
      AV18messages.clear();
      AV10Colores.clear();
      /* Using cursor P0AQJ2 */
      pr_default.execute(0, new Object[] {AV11EMprcod, Integer.valueOf(AV14ForNumCol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A486ForNumCol = P0AQJ2_A486ForNumCol[0] ;
         A396EmprCod = P0AQJ2_A396EmprCod[0] ;
         A831TipColCod = P0AQJ2_A831TipColCod[0] ;
         A483ForColNum = P0AQJ2_A483ForColNum[0] ;
         A482ForColNom = P0AQJ2_A482ForColNom[0] ;
         A494ForSer = P0AQJ2_A494ForSer[0] ;
         A252CliCod = P0AQJ2_A252CliCod[0] ;
         A7781ForBlo = P0AQJ2_A7781ForBlo[0] ;
         n7781ForBlo = P0AQJ2_n7781ForBlo[0] ;
         if ( ( A252CliCod == AV8clicod ) && ( GXutil.strcmp(A494ForSer, AV15forser) == 0 ) && ( GXutil.strcmp(A482ForColNom, AV12forcolnom) == 0 ) && ( A483ForColNum == AV13forcolnum ) && ( A831TipColCod == AV21tipcolcod ) )
         {
         }
         else
         {
            AV17message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV17message.setgxTv_SdtMessages_Message_Id( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")+"/"+GXutil.trim( A494ForSer)+"/"+GXutil.trim( A482ForColNom)+"/"+localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")+"/"+localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") );
            AV17message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Cambio ForBlo ", "")+A7781ForBlo+httpContext.getMessage( " por S", "") );
            AV18messages.add(AV17message, 0);
            A7781ForBlo = "S" ;
            n7781ForBlo = false ;
            AV9Color = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV9Color.setgxTv_SdtMessages_Message_Id( GXutil.str( A252CliCod, 6, 0)+A494ForSer+A482ForColNom+GXutil.str( A483ForColNum, 6, 0)+GXutil.str( A831TipColCod, 2, 0) );
            AV10Colores.add(AV9Color, 0);
         }
         /* Using cursor P0AQJ3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n7781ForBlo), A7781ForBlo, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV18messages.size() > 0 )
      {
         AV16inc_obs = httpContext.getMessage( "CambioColoresBloqueados", "") + GXutil.newLine( ) ;
         AV16inc_obs += AV18messages.toJSonString(false) ;
         new app.pinscrtinc(remoteHandle, context).execute( A396EmprCod, AV33Pgmname, AV22usurcod, AV19station, AV16inc_obs, 12345678, (byte)(0), " ") ;
      }
      if ( AV10Colores.size() > 0 )
      {
         AV29colores_json = AV10Colores.toJSonString(false) ;
         new app.formulaciontinte.cambiocoloresbloqueadosdeleteobservaciones(remoteHandle, context).execute( AV11EMprcod, AV8clicod, AV15forser, AV12forcolnom, AV13forcolnum, AV21tipcolcod, AV29colores_json, AV22usurcod, AV19station) ;
         new app.formulaciontinte.cambiocoloresbloqueadosobservaciones(remoteHandle, context).execute( AV11EMprcod, AV8clicod, AV15forser, AV12forcolnom, AV13forcolnum, AV21tipcolcod, AV29colores_json, AV22usurcod, AV19station) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.cambiocoloresbloqueados");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16inc_obs = "" ;
      AV18messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV10Colores = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      scmdbuf = "" ;
      P0AQJ2_A486ForNumCol = new int[1] ;
      P0AQJ2_A396EmprCod = new String[] {""} ;
      P0AQJ2_A831TipColCod = new byte[1] ;
      P0AQJ2_A483ForColNum = new int[1] ;
      P0AQJ2_A482ForColNom = new String[] {""} ;
      P0AQJ2_A494ForSer = new String[] {""} ;
      P0AQJ2_A252CliCod = new int[1] ;
      P0AQJ2_A7781ForBlo = new String[] {""} ;
      P0AQJ2_n7781ForBlo = new boolean[] {false} ;
      A396EmprCod = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A7781ForBlo = "" ;
      AV17message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV9Color = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV33Pgmname = "" ;
      AV29colores_json = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cambiocoloresbloqueados__default(),
         new Object[] {
             new Object[] {
            P0AQJ2_A486ForNumCol, P0AQJ2_A396EmprCod, P0AQJ2_A831TipColCod, P0AQJ2_A483ForColNum, P0AQJ2_A482ForColNom, P0AQJ2_A494ForSer, P0AQJ2_A252CliCod, P0AQJ2_A7781ForBlo, P0AQJ2_n7781ForBlo
            }
            , new Object[] {
            }
         }
      );
      AV33Pgmname = "FormulacionTinte.CambioColoresBloqueados" ;
      /* GeneXus formulas. */
      AV33Pgmname = "FormulacionTinte.CambioColoresBloqueados" ;
      Gx_err = (short)(0) ;
   }

   private byte AV21tipcolcod ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV14ForNumCol ;
   private int AV8clicod ;
   private int AV13forcolnum ;
   private int A486ForNumCol ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private String AV11EMprcod ;
   private String AV15forser ;
   private String AV12forcolnom ;
   private String AV22usurcod ;
   private String AV19station ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A7781ForBlo ;
   private String AV33Pgmname ;
   private boolean n7781ForBlo ;
   private String AV29colores_json ;
   private String AV16inc_obs ;
   private IDataStoreProvider pr_default ;
   private int[] P0AQJ2_A486ForNumCol ;
   private String[] P0AQJ2_A396EmprCod ;
   private byte[] P0AQJ2_A831TipColCod ;
   private int[] P0AQJ2_A483ForColNum ;
   private String[] P0AQJ2_A482ForColNom ;
   private String[] P0AQJ2_A494ForSer ;
   private int[] P0AQJ2_A252CliCod ;
   private String[] P0AQJ2_A7781ForBlo ;
   private boolean[] P0AQJ2_n7781ForBlo ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV18messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV10Colores ;
   private com.genexus.SdtMessages_Message AV17message ;
   private com.genexus.SdtMessages_Message AV9Color ;
}

final  class cambiocoloresbloqueados__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQJ2", "SELECT ForNumCol, EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForBlo FROM TXPCFORMU WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AQJ3", "UPDATE TXPCFORMU SET ForBlo=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

