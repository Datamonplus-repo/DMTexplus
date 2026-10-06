package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rvxarttipo extends GXProcedure
{
   public rvxarttipo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rvxarttipo.class ), "" );
   }

   public rvxarttipo( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      rvxarttipo.this.aP1 = new String[] {""};
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
      rvxarttipo.this.A7420VxArtCod = aP0;
      rvxarttipo.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09R02 */
      pr_default.execute(0, new Object[] {A7420VxArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12586VxArtTipo = P09R02_A12586VxArtTipo[0] ;
         n12586VxArtTipo = P09R02_n12586VxArtTipo[0] ;
         AV8VxArtTipo = A12586VxArtTipo ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = rvxarttipo.this.AV8VxArtTipo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8VxArtTipo = "" ;
      scmdbuf = "" ;
      P09R02_A7420VxArtCod = new String[] {""} ;
      P09R02_A12586VxArtTipo = new String[] {""} ;
      P09R02_n12586VxArtTipo = new boolean[] {false} ;
      A12586VxArtTipo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rvxarttipo__default(),
         new Object[] {
             new Object[] {
            P09R02_A7420VxArtCod, P09R02_A12586VxArtTipo, P09R02_n12586VxArtTipo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A7420VxArtCod ;
   private String AV8VxArtTipo ;
   private String scmdbuf ;
   private String A12586VxArtTipo ;
   private boolean n12586VxArtTipo ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P09R02_A7420VxArtCod ;
   private String[] P09R02_A12586VxArtTipo ;
   private boolean[] P09R02_n12586VxArtTipo ;
}

final  class rvxarttipo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09R02", "SELECT ArtCod, ArtTipo FROM VTXARTIC WHERE ArtCod = ? ORDER BY ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 16);
               return;
      }
   }

}

