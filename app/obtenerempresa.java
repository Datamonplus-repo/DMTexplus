package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtenerempresa extends GXProcedure
{
   public obtenerempresa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtenerempresa.class ), "" );
   }

   public obtenerempresa( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      obtenerempresa.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      obtenerempresa.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15CadenaAutenticacion = AV14WebSession.getValue("TexplusNET_Autentication") ;
      AV12SdtAutenticacion.fromJSonString(AV15CadenaAutenticacion, null);
      if ( (GXutil.strcmp("", AV12SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena03())==0) )
      {
         GXt_int1 = AV16TipoVersion ;
         GXv_int2[0] = GXt_int1 ;
         new app.ficherosbasicos.obtenerversionempresa(remoteHandle, context).execute( GXv_int2) ;
         obtenerempresa.this.GXt_int1 = GXv_int2[0] ;
         AV16TipoVersion = GXt_int1 ;
         if ( AV16TipoVersion == 1 )
         {
            GXt_boolean3 = AV13EsMultiEmpresa ;
            GXv_boolean4[0] = GXt_boolean3 ;
            new app.determinarmultiempresa(remoteHandle, context).execute( GXv_boolean4) ;
            obtenerempresa.this.GXt_boolean3 = GXv_boolean4[0] ;
            AV13EsMultiEmpresa = GXt_boolean3 ;
         }
         if ( ! AV13EsMultiEmpresa )
         {
            AV19GXLvl9 = (byte)(0) ;
            /* Using cursor P07WJ2 */
            pr_default.execute(0);
            while ( (pr_default.getStatus(0) != 101) )
            {
               A407EmprNom = P07WJ2_A407EmprNom[0] ;
               n407EmprNom = P07WJ2_n407EmprNom[0] ;
               A396EmprCod = P07WJ2_A396EmprCod[0] ;
               AV19GXLvl9 = (byte)(1) ;
               AV11EmprCod = A396EmprCod ;
               pr_default.readNext(0);
            }
            pr_default.close(0);
            if ( AV19GXLvl9 == 0 )
            {
               if ( ( AV16TipoVersion == 2 ) || ( AV16TipoVersion == 3 ) )
               {
               }
            }
         }
      }
      else
      {
         AV11EmprCod = httpContext.decrypt64( AV12SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena04(), AV12SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena02()) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = obtenerempresa.this.AV11EmprCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11EmprCod = "" ;
      AV15CadenaAutenticacion = "" ;
      AV14WebSession = httpContext.getWebSession();
      AV12SdtAutenticacion = new app.wwpbaseobjects.SdtSDTAutenticacion(remoteHandle, context);
      GXv_int2 = new short[1] ;
      GXv_boolean4 = new boolean[1] ;
      scmdbuf = "" ;
      P07WJ2_A407EmprNom = new String[] {""} ;
      P07WJ2_n407EmprNom = new boolean[] {false} ;
      P07WJ2_A396EmprCod = new String[] {""} ;
      A407EmprNom = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.obtenerempresa__default(),
         new Object[] {
             new Object[] {
            P07WJ2_A407EmprNom, P07WJ2_n407EmprNom, P07WJ2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19GXLvl9 ;
   private short AV16TipoVersion ;
   private short GXt_int1 ;
   private short GXv_int2[] ;
   private short Gx_err ;
   private String AV11EmprCod ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A396EmprCod ;
   private boolean AV13EsMultiEmpresa ;
   private boolean GXt_boolean3 ;
   private boolean GXv_boolean4[] ;
   private boolean n407EmprNom ;
   private String AV15CadenaAutenticacion ;
   private com.genexus.webpanels.WebSession AV14WebSession ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P07WJ2_A407EmprNom ;
   private boolean[] P07WJ2_n407EmprNom ;
   private String[] P07WJ2_A396EmprCod ;
   private app.wwpbaseobjects.SdtSDTAutenticacion AV12SdtAutenticacion ;
}

final  class obtenerempresa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07WJ2", "SELECT EmprNom, EmprCod FROM TXPEMPRES ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

