package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactshab extends GXProcedure
{
   public pactshab( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactshab.class ), "" );
   }

   public pactshab( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pactshab.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pactshab.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactshab.this.A7031ShaCod = aP1[0];
      this.aP1 = aP1;
      pactshab.this.AV9ShaUbi = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02YG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A7031ShaCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7041ShaDibCli = P02YG2_A7041ShaDibCli[0] ;
         A7042ShaDibInt = P02YG2_A7042ShaDibInt[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = A7041ShaDibCli ;
         GXv_int3[0] = A7042ShaDibInt ;
         GXv_char4[0] = AV9ShaUbi ;
         GXv_int5[0] = 0 ;
         new app.pactsha(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_char4, GXv_int5) ;
         pactshab.this.A396EmprCod = GXv_char1[0] ;
         pactshab.this.A7041ShaDibCli = GXv_char2[0] ;
         pactshab.this.A7042ShaDibInt = GXv_int3[0] ;
         pactshab.this.AV9ShaUbi = GXv_char4[0] ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactshab.this.A396EmprCod;
      this.aP1[0] = pactshab.this.A7031ShaCod;
      this.aP2[0] = pactshab.this.AV9ShaUbi;
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
      P02YG2_A396EmprCod = new String[] {""} ;
      P02YG2_A7031ShaCod = new String[] {""} ;
      P02YG2_A7041ShaDibCli = new String[] {""} ;
      P02YG2_A7042ShaDibInt = new int[1] ;
      A7041ShaDibCli = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactshab__default(),
         new Object[] {
             new Object[] {
            P02YG2_A396EmprCod, P02YG2_A7031ShaCod, P02YG2_A7041ShaDibCli, P02YG2_A7042ShaDibInt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A7042ShaDibInt ;
   private int GXv_int3[] ;
   private int GXv_int5[] ;
   private String A396EmprCod ;
   private String A7031ShaCod ;
   private String AV9ShaUbi ;
   private String scmdbuf ;
   private String A7041ShaDibCli ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02YG2_A396EmprCod ;
   private String[] P02YG2_A7031ShaCod ;
   private String[] P02YG2_A7041ShaDibCli ;
   private int[] P02YG2_A7042ShaDibInt ;
}

final  class pactshab__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02YG2", "SELECT EmprCod, ShaCod, ShaDibCli, ShaDibInt FROM TXPShablo WHERE EmprCod = ? and ShaCod = ? ORDER BY EmprCod, ShaCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

