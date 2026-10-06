package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedemp extends GXProcedure
{
   public ppedemp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedemp.class ), "" );
   }

   public ppedemp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      ppedemp.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      ppedemp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedemp.this.AV10DisCod = aP1[0];
      this.aP1 = aP1;
      ppedemp.this.AV8AlbRef = aP2[0];
      this.aP2 = aP2;
      ppedemp.this.AV9AlbRefDsc = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P012R2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P012R2_A44AlbRecCod[0] ;
         A45AlbRef = P012R2_A45AlbRef[0] ;
         A3613AlbRefDsc = P012R2_A3613AlbRefDsc[0] ;
         AV8AlbRef = A45AlbRef ;
         AV9AlbRefDsc = A3613AlbRefDsc ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedemp.this.A396EmprCod;
      this.aP1[0] = ppedemp.this.AV10DisCod;
      this.aP2[0] = ppedemp.this.AV8AlbRef;
      this.aP3[0] = ppedemp.this.AV9AlbRefDsc;
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
      P012R2_A396EmprCod = new String[] {""} ;
      P012R2_A44AlbRecCod = new int[1] ;
      P012R2_A45AlbRef = new String[] {""} ;
      P012R2_A3613AlbRefDsc = new String[] {""} ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedemp__default(),
         new Object[] {
             new Object[] {
            P012R2_A396EmprCod, P012R2_A44AlbRecCod, P012R2_A45AlbRef, P012R2_A3613AlbRefDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV10DisCod ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String AV8AlbRef ;
   private String AV9AlbRefDsc ;
   private String scmdbuf ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P012R2_A396EmprCod ;
   private int[] P012R2_A44AlbRecCod ;
   private String[] P012R2_A45AlbRef ;
   private String[] P012R2_A3613AlbRefDsc ;
}

final  class ppedemp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P012R2", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRef, AlbRefDsc FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
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

