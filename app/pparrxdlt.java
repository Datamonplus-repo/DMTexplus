package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pparrxdlt extends GXProcedure
{
   public pparrxdlt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pparrxdlt.class ), "" );
   }

   public pparrxdlt( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 )
   {
      pparrxdlt.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      pparrxdlt.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pparrxdlt.this.A966PartCod = aP1[0];
      this.aP1 = aP1;
      pparrxdlt.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02152 */
      pr_default.execute(0, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5878PartLinUni = P02152_A5878PartLinUni[0] ;
         n5878PartLinUni = P02152_n5878PartLinUni[0] ;
         A979PartLin = P02152_A979PartLin[0] ;
         if ( GXutil.strcmp(A5878PartLinUni, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_char2[0] = A966PartCod ;
            GXv_int3[0] = A252CliCod ;
            GXv_int4[0] = A979PartLin ;
            new app.ppar1rxdlt(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_int4) ;
            pparrxdlt.this.A396EmprCod = GXv_char1[0] ;
            pparrxdlt.this.A966PartCod = GXv_char2[0] ;
            pparrxdlt.this.A252CliCod = GXv_int3[0] ;
            pparrxdlt.this.A979PartLin = GXv_int4[0] ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pparrxdlt.this.A396EmprCod;
      this.aP1[0] = pparrxdlt.this.A966PartCod;
      this.aP2[0] = pparrxdlt.this.A252CliCod;
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
      P02152_A396EmprCod = new String[] {""} ;
      P02152_A966PartCod = new String[] {""} ;
      P02152_A252CliCod = new int[1] ;
      P02152_A5878PartLinUni = new String[] {""} ;
      P02152_n5878PartLinUni = new boolean[] {false} ;
      P02152_A979PartLin = new int[1] ;
      A5878PartLinUni = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pparrxdlt__default(),
         new Object[] {
             new Object[] {
            P02152_A396EmprCod, P02152_A966PartCod, P02152_A252CliCod, P02152_A5878PartLinUni, P02152_n5878PartLinUni, P02152_A979PartLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int A979PartLin ;
   private int GXv_int3[] ;
   private int GXv_int4[] ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String scmdbuf ;
   private String A5878PartLinUni ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private boolean n5878PartLinUni ;
   private int[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02152_A396EmprCod ;
   private String[] P02152_A966PartCod ;
   private int[] P02152_A252CliCod ;
   private String[] P02152_A5878PartLinUni ;
   private boolean[] P02152_n5878PartLinUni ;
   private int[] P02152_A979PartLin ;
}

final  class pparrxdlt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02152", "SELECT EmprCod, PartCod, CliCod, PartLinUni, PartLin FROM TXPLPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

