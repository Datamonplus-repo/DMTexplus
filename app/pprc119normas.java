package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc119normas extends GXProcedure
{
   public pprc119normas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc119normas.class ), "" );
   }

   public pprc119normas( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 )
   {
      pprc119normas.this.AV8EMprcod = aP0;
      pprc119normas.this.AV9PrdNum = aP1;
      pprc119normas.this.AV10PrdNom = aP2;
      pprc119normas.this.AV15NormaIDinout = aP3;
      pprc119normas.this.AV14NormaDsc = aP4;
      pprc119normas.this.AV12UsurCod = aP5;
      pprc119normas.this.AV13Station = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPPrdNor

      */
      A396EmprCod = AV8EMprcod ;
      A719PrdNum = AV9PrdNum ;
      A13217NormaID = AV15NormaIDinout ;
      /* Using cursor P095X2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, A13217NormaID});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPrdNor");
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
      AV16inc_obs = httpContext.getMessage( "Alta Norma ", "") + GXutil.trim( AV15NormaIDinout) + " " + GXutil.trim( AV14NormaDsc) ;
      AV16inc_obs += httpContext.getMessage( "Producto ", "") + AV9PrdNum + " " + AV10PrdNom ;
      new app.pctrinc(remoteHandle, context).execute( AV8EMprcod, GXutil.substring( AV19Pgmname, 1, 10), AV12UsurCod, AV13Station, AV16inc_obs, 99999999, (byte)(0), " ") ;
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
      A719PrdNum = "" ;
      A13217NormaID = "" ;
      Gx_emsg = "" ;
      AV16inc_obs = "" ;
      AV19Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc119normas__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      AV19Pgmname = "PPrc119Normas" ;
      /* GeneXus formulas. */
      AV19Pgmname = "PPrc119Normas" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GX_INS1875 ;
   private String AV8EMprcod ;
   private String AV9PrdNum ;
   private String AV10PrdNom ;
   private String AV15NormaIDinout ;
   private String AV14NormaDsc ;
   private String AV12UsurCod ;
   private String AV13Station ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A13217NormaID ;
   private String Gx_emsg ;
   private String AV19Pgmname ;
   private String AV16inc_obs ;
   private IDataStoreProvider pr_default ;
}

final  class pprc119normas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P095X2", "INSERT INTO TXPPrdNor(EmprCod, PrdNum, NormaID) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPrdNor")
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               return;
      }
   }

}

