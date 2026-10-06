package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnextcalprd extends GXProcedure
{
   public pnextcalprd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnextcalprd.class ), "" );
   }

   public pnextcalprd( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     long[] aP1 ,
                                     int[] aP2 )
   {
      pnextcalprd.this.aP3 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        java.util.Date[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             java.util.Date[] aP3 )
   {
      pnextcalprd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnextcalprd.this.AV8ALbprocod = aP1[0];
      this.aP1 = aP1;
      pnextcalprd.this.AV9Guiremcli = aP2[0];
      this.aP2 = aP2;
      pnextcalprd.this.AV10ALbProfch = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04D82 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV8ALbprocod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5140AlbMarca = P04D82_A5140AlbMarca[0] ;
         A30AlbProCod = P04D82_A30AlbProCod[0] ;
         A1243GuiRemCli = P04D82_A1243GuiRemCli[0] ;
         A34AlbProfch = P04D82_A34AlbProfch[0] ;
         if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) != 0 )
         {
            AV9Guiremcli = A1243GuiRemCli ;
            AV10ALbProfch = A34AlbProfch ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnextcalprd.this.A396EmprCod;
      this.aP1[0] = pnextcalprd.this.AV8ALbprocod;
      this.aP2[0] = pnextcalprd.this.AV9Guiremcli;
      this.aP3[0] = pnextcalprd.this.AV10ALbProfch;
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
      P04D82_A396EmprCod = new String[] {""} ;
      P04D82_A5140AlbMarca = new String[] {""} ;
      P04D82_A30AlbProCod = new long[1] ;
      P04D82_A1243GuiRemCli = new int[1] ;
      P04D82_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A5140AlbMarca = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnextcalprd__default(),
         new Object[] {
             new Object[] {
            P04D82_A396EmprCod, P04D82_A5140AlbMarca, P04D82_A30AlbProCod, P04D82_A1243GuiRemCli, P04D82_A34AlbProfch
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV9Guiremcli ;
   private int A1243GuiRemCli ;
   private long AV8ALbprocod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A5140AlbMarca ;
   private java.util.Date AV10ALbProfch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date[] aP3 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04D82_A396EmprCod ;
   private String[] P04D82_A5140AlbMarca ;
   private long[] P04D82_A30AlbProCod ;
   private int[] P04D82_A1243GuiRemCli ;
   private java.util.Date[] P04D82_A34AlbProfch ;
}

final  class pnextcalprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04D82", "SELECT EmprCod, AlbMarca, AlbProCod, GuiRemCli, AlbProfch FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod > ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

