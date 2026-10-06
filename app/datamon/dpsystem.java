package app.datamon ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpsystem extends GXProcedure
{
   public dpsystem( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpsystem.class ), "" );
   }

   public dpsystem( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.datamon.SdtSdtSystem_System> executeUdp( String aP0 )
   {
      dpsystem.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<app.datamon.SdtSdtSystem_System>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GXBaseCollection<app.datamon.SdtSdtSystem_System>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GXBaseCollection<app.datamon.SdtSdtSystem_System>[] aP1 )
   {
      dpsystem.this.AV7UsuCod = aP0;
      dpsystem.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P004H2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14294MnuSit = P004H2_A14294MnuSit[0] ;
         A945MnuId = P004H2_A945MnuId[0] ;
         A946MnuOp = P004H2_A946MnuOp[0] ;
         A947MnuPgm = P004H2_A947MnuPgm[0] ;
         A949MnuPgmTxt = P004H2_A949MnuPgmTxt[0] ;
         GXv_char1[0] = A945MnuId ;
         GXv_int2[0] = A946MnuOp ;
         GXv_char3[0] = AV7UsuCod ;
         if ( GXutil.strcmp(new app.ppermisos(remoteHandle, context).executeUdp( GXv_char1, GXv_int2, GXv_char3), "S") == 0 )
         {
            Gxm1sdtsystem = (app.datamon.SdtSdtSystem_System)new app.datamon.SdtSdtSystem_System(remoteHandle, context);
            Gxm2rootcol.add(Gxm1sdtsystem, 0);
            AV5Image = httpContext.getMessage( "https://dummyimage.com/100x100/b0aeb0/030303.png", "") ;
            AV14Image_GXI = GXDbFile.pathToUrl( httpContext.getMessage( httpContext.getMessage( "https://dummyimage.com/100x100/b0aeb0/030303.png", ""), ""), context.getHttpContext()) ;
            AV6GUID = java.util.UUID.randomUUID( ) ;
            Gxm1sdtsystem.setgxTv_SdtSdtSystem_System_Systemid( A947MnuPgm );
            Gxm1sdtsystem.setgxTv_SdtSdtSystem_System_Systemname( A949MnuPgmTxt );
            Gxm1sdtsystem.setgxTv_SdtSdtSystem_System_Systemdescription( httpContext.getMessage( "MODULO", "") );
            Gxm1sdtsystem.setgxTv_SdtSdtSystem_System_Systemimage( AV5Image );
            Gxm1sdtsystem.setgxTv_SdtSdtSystem_System_Systemimage_gxi( AV14Image_GXI );
            Gxm1sdtsystem.setgxTv_SdtSdtSystem_System_Systemurl( "#" );
            Gxm1sdtsystem.setgxTv_SdtSdtSystem_System_Systemtoken( AV6GUID.toString() );
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dpsystem.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.datamon.SdtSdtSystem_System>(app.datamon.SdtSdtSystem_System.class, "System", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P004H2_A14294MnuSit = new String[] {""} ;
      P004H2_A945MnuId = new String[] {""} ;
      P004H2_A946MnuOp = new byte[1] ;
      P004H2_A947MnuPgm = new String[] {""} ;
      P004H2_A949MnuPgmTxt = new String[] {""} ;
      A14294MnuSit = "" ;
      A945MnuId = "" ;
      A947MnuPgm = "" ;
      A949MnuPgmTxt = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char3 = new String[1] ;
      Gxm1sdtsystem = new app.datamon.SdtSdtSystem_System(remoteHandle, context);
      AV5Image = "" ;
      AV14Image_GXI = "" ;
      AV6GUID = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.datamon.dpsystem__default(),
         new Object[] {
             new Object[] {
            P004H2_A14294MnuSit, P004H2_A945MnuId, P004H2_A946MnuOp, P004H2_A947MnuPgm, P004H2_A949MnuPgmTxt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A946MnuOp ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private String scmdbuf ;
   private String A14294MnuSit ;
   private String A945MnuId ;
   private String A947MnuPgm ;
   private String A949MnuPgmTxt ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String AV7UsuCod ;
   private String AV14Image_GXI ;
   private String AV5Image ;
   private java.util.UUID AV6GUID ;
   private GXBaseCollection<app.datamon.SdtSdtSystem_System>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P004H2_A14294MnuSit ;
   private String[] P004H2_A945MnuId ;
   private byte[] P004H2_A946MnuOp ;
   private String[] P004H2_A947MnuPgm ;
   private String[] P004H2_A949MnuPgmTxt ;
   private GXBaseCollection<app.datamon.SdtSdtSystem_System> Gxm2rootcol ;
   private app.datamon.SdtSdtSystem_System Gxm1sdtsystem ;
}

final  class dpsystem__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004H2", "SELECT MnuSit, MnuId, MnuOp, MnuPgm, MnuPgmTxt FROM TXPMNUOP WHERE (MnuId = 'MPRINCIP') AND (MnuSit = 'T') ORDER BY MnuId, MnuOp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
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

