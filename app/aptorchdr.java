package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptorchdr extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptorchdr pgm = new aptorchdr (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptorchdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptorchdr.class ), "" );
   }

   public aptorchdr( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV13EmprNom ;
      GXv_char3[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char1, GXv_char2, GXv_char3) ;
      aptorchdr.this.A396EmprCod = GXv_char1[0] ;
      aptorchdr.this.AV13EmprNom = GXv_char2[0] ;
      aptorchdr.this.AV14UsurCod = GXv_char3[0] ;
      if ( GXutil.strcmp(AV11OK, httpContext.getMessage( "S", "")) == 0 )
      {
         n4833BarAudTur = false ;
         /* Optimized UPDATE. */
         /* Using cursor P03VR2 */
         pr_default.execute(0, new Object[] {Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptorchdr.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptorchdr");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Station = "" ;
      A396EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV13EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV14UsurCod = "" ;
      GXv_char3 = new String[1] ;
      AV11OK = "" ;
      AV10BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptorchdr__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarCodReo ;
   private short Gx_err ;
   private int AV8BarCod ;
   private String AV12Station ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
   private String AV13EmprNom ;
   private String GXv_char2[] ;
   private String AV14UsurCod ;
   private String GXv_char3[] ;
   private String AV11OK ;
   private String AV10BarCodPar ;
   private boolean n4833BarAudTur ;
   private IDataStoreProvider pr_default ;
}

final  class aptorchdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03VR2", "UPDATE TXPBARCAD SET BarAudTur=1  WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

