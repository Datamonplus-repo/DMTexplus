package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partdish extends GXProcedure
{
   public partdish( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partdish.class ), "" );
   }

   public partdish( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      partdish.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      partdish.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partdish.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      partdish.this.AV8BarCod = aP2[0];
      this.aP2 = aP2;
      partdish.this.AV9BarCodReo = aP3[0];
      this.aP3 = aP3;
      partdish.this.AV10BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13GXLvl1 = (byte)(0) ;
      /* Using cursor P033V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P033V2_A130BarCodPar[0] ;
         A132BarCodReo = P033V2_A132BarCodReo[0] ;
         A129BarCod = P033V2_A129BarCod[0] ;
         AV13GXLvl1 = (byte)(1) ;
         AV8BarCod = A129BarCod ;
         AV9BarCodReo = A132BarCodReo ;
         AV10BarCodPar = A130BarCodPar ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV13GXLvl1 == 0 )
      {
         AV8BarCod = A361DisCod ;
         AV9BarCodReo = (byte)(0) ;
         AV10BarCodPar = "" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partdish.this.A396EmprCod;
      this.aP1[0] = partdish.this.A361DisCod;
      this.aP2[0] = partdish.this.AV8BarCod;
      this.aP3[0] = partdish.this.AV9BarCodReo;
      this.aP4[0] = partdish.this.AV10BarCodPar;
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
      P033V2_A396EmprCod = new String[] {""} ;
      P033V2_A361DisCod = new int[1] ;
      P033V2_A130BarCodPar = new String[] {""} ;
      P033V2_A132BarCodReo = new byte[1] ;
      P033V2_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partdish__default(),
         new Object[] {
             new Object[] {
            P033V2_A396EmprCod, P033V2_A361DisCod, P033V2_A130BarCodPar, P033V2_A132BarCodReo, P033V2_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarCodReo ;
   private byte AV13GXLvl1 ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A361DisCod ;
   private int AV8BarCod ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P033V2_A396EmprCod ;
   private int[] P033V2_A361DisCod ;
   private String[] P033V2_A130BarCodPar ;
   private byte[] P033V2_A132BarCodReo ;
   private int[] P033V2_A129BarCod ;
}

final  class partdish__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P033V2", "SELECT * FROM (SELECT EmprCod, DisCod, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

