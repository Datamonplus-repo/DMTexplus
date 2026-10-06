package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedapa extends GXProcedure
{
   public ppedapa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedapa.class ), "" );
   }

   public ppedapa( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      ppedapa.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      ppedapa.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedapa.this.AV10PACAlbRec = aP1[0];
      this.aP1 = aP1;
      ppedapa.this.AV16AlbRef = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04Q92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10PACAlbRec)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P04Q92_A44AlbRecCod[0] ;
         A45AlbRef = P04Q92_A45AlbRef[0] ;
         AV16AlbRef = A45AlbRef ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedapa.this.A396EmprCod;
      this.aP1[0] = ppedapa.this.AV10PACAlbRec;
      this.aP2[0] = ppedapa.this.AV16AlbRef;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P04Q92_A396EmprCod = new String[] {""} ;
      P04Q92_A44AlbRecCod = new int[1] ;
      P04Q92_A45AlbRef = new String[] {""} ;
      A45AlbRef = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedapa__default(),
         new Object[] {
             new Object[] {
            P04Q92_A396EmprCod, P04Q92_A44AlbRecCod, P04Q92_A45AlbRef
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV10PACAlbRec ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String AV16AlbRef ;
   private String scmdbuf ;
   private String A45AlbRef ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04Q92_A396EmprCod ;
   private int[] P04Q92_A44AlbRecCod ;
   private String[] P04Q92_A45AlbRef ;
}

final  class ppedapa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04Q92", "SELECT EmprCod, AlbRecCod, AlbRef FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

