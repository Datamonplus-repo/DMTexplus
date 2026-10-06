package app.ponteway.v1 ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class get_importartcod extends GXProcedure
{
   public get_importartcod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( get_importartcod.class ), "" );
   }

   public get_importartcod( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      get_importartcod.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      get_importartcod.this.AV9ogARecCod = aP0;
      get_importartcod.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9ogARecCod = "" ;
      /* Using cursor P0AT42 */
      pr_default.execute(0, new Object[] {AV11EmprCod, AV9ogARecCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P0AT42_A44AlbRecCod[0] ;
         A396EmprCod = P0AT42_A396EmprCod[0] ;
         A45AlbRef = P0AT42_A45AlbRef[0] ;
         AV12ArtCod = A45AlbRef ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = get_importartcod.this.AV12ArtCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12ArtCod = "" ;
      scmdbuf = "" ;
      AV11EmprCod = "" ;
      P0AT42_A44AlbRecCod = new int[1] ;
      P0AT42_A396EmprCod = new String[] {""} ;
      P0AT42_A45AlbRef = new String[] {""} ;
      A396EmprCod = "" ;
      A45AlbRef = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ponteway.v1.get_importartcod__default(),
         new Object[] {
             new Object[] {
            P0AT42_A44AlbRecCod, P0AT42_A396EmprCod, P0AT42_A45AlbRef
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A44AlbRecCod ;
   private String AV12ArtCod ;
   private String scmdbuf ;
   private String AV11EmprCod ;
   private String A396EmprCod ;
   private String A45AlbRef ;
   private String AV9ogARecCod ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P0AT42_A44AlbRecCod ;
   private String[] P0AT42_A396EmprCod ;
   private String[] P0AT42_A45AlbRef ;
}

final  class get_importartcod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AT42", "SELECT * FROM (SELECT AlbRecCod, EmprCod, AlbRef FROM TXPALBREC WHERE (EmprCod = ?) AND (AlbRecCod = TO_NUMBER(NVL(TRIM(?), '0'))) ORDER BY EmprCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
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
               stmt.setVarchar(2, (String)parms[1], 8);
               return;
      }
   }

}

