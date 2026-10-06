package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacbqui extends GXProcedure
{
   public pacbqui( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacbqui.class ), "" );
   }

   public pacbqui( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pacbqui.this.aP2 = new String[] {""};
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
      pacbqui.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pacbqui.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pacbqui.this.A758ProCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8PROFORCOD = " " ;
      /* Using cursor P02HH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A764ProForCod = P02HH2_A764ProForCod[0] ;
         A5377DisQuiLin = P02HH2_A5377DisQuiLin[0] ;
         A368DisFasLin = P02HH2_A368DisFasLin[0] ;
         AV8PROFORCOD = A764ProForCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P02HH3 */
      pr_default.execute(1, new Object[] {AV8PROFORCOD, A396EmprCod, Integer.valueOf(A361DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pacbqui.this.A396EmprCod;
      this.aP1[0] = pacbqui.this.A361DisCod;
      this.aP2[0] = pacbqui.this.A758ProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pacbqui");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8PROFORCOD = "" ;
      scmdbuf = "" ;
      P02HH2_A396EmprCod = new String[] {""} ;
      P02HH2_A361DisCod = new int[1] ;
      P02HH2_A758ProCod = new String[] {""} ;
      P02HH2_A764ProForCod = new String[] {""} ;
      P02HH2_A5377DisQuiLin = new short[1] ;
      P02HH2_A368DisFasLin = new short[1] ;
      A764ProForCod = "" ;
      A333DisArtAca = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pacbqui__default(),
         new Object[] {
             new Object[] {
            P02HH2_A396EmprCod, P02HH2_A361DisCod, P02HH2_A758ProCod, P02HH2_A764ProForCod, P02HH2_A5377DisQuiLin, P02HH2_A368DisFasLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A5377DisQuiLin ;
   private short A368DisFasLin ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String AV8PROFORCOD ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private String A333DisArtAca ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02HH2_A396EmprCod ;
   private int[] P02HH2_A361DisCod ;
   private String[] P02HH2_A758ProCod ;
   private String[] P02HH2_A764ProForCod ;
   private short[] P02HH2_A5377DisQuiLin ;
   private short[] P02HH2_A368DisFasLin ;
}

final  class pacbqui__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02HH2", "SELECT EmprCod, DisCod, ProCod, ProForCod, DisQuiLin, DisFasLin FROM TXPDISQUI WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02HH3", "UPDATE TXPDISPOS SET DisArtAca=?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

