package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class lasthdr extends GXProcedure
{
   public lasthdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lasthdr.class ), "" );
   }

   public lasthdr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      lasthdr.this.aP1 = new String[] {""};
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
      lasthdr.this.A396EmprCod = aP0;
      lasthdr.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8barnhdr = "" ;
      /* Using cursor P0A5Q2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P0A5Q2_A361DisCod[0] ;
         A130BarCodPar = P0A5Q2_A130BarCodPar[0] ;
         A132BarCodReo = P0A5Q2_A132BarCodReo[0] ;
         A129BarCod = P0A5Q2_A129BarCod[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV8barnhdr = A13696BarNHdr ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = lasthdr.this.AV8barnhdr;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8barnhdr = "" ;
      scmdbuf = "" ;
      P0A5Q2_A396EmprCod = new String[] {""} ;
      P0A5Q2_A361DisCod = new int[1] ;
      P0A5Q2_A130BarCodPar = new String[] {""} ;
      P0A5Q2_A132BarCodReo = new byte[1] ;
      P0A5Q2_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.lasthdr__default(),
         new Object[] {
             new Object[] {
            P0A5Q2_A396EmprCod, P0A5Q2_A361DisCod, P0A5Q2_A130BarCodPar, P0A5Q2_A132BarCodReo, P0A5Q2_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV8barnhdr ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A5Q2_A396EmprCod ;
   private int[] P0A5Q2_A361DisCod ;
   private String[] P0A5Q2_A130BarCodPar ;
   private byte[] P0A5Q2_A132BarCodReo ;
   private int[] P0A5Q2_A129BarCod ;
}

final  class lasthdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A5Q2", "SELECT * FROM (SELECT EmprCod, DisCod, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE (EmprCod = ?) AND (DisCod > 0) ORDER BY EmprCod, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               return;
      }
   }

}

