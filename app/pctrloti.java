package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrloti extends GXProcedure
{
   public pctrloti( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrloti.class ), "" );
   }

   public pctrloti( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 )
   {
      pctrloti.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pctrloti.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrloti.this.AV8Int_Num = aP1[0];
      this.aP1 = aP1;
      pctrloti.this.AV9Existe_ot = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Existe_ot = (byte)(0) ;
      /* Using cursor P031Z2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Int_Num)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P031Z2_A129BarCod[0] ;
         A130BarCodPar = P031Z2_A130BarCodPar[0] ;
         A132BarCodReo = P031Z2_A132BarCodReo[0] ;
         AV9Existe_ot = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrloti.this.A396EmprCod;
      this.aP1[0] = pctrloti.this.AV8Int_Num;
      this.aP2[0] = pctrloti.this.AV9Existe_ot;
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
      P031Z2_A396EmprCod = new String[] {""} ;
      P031Z2_A129BarCod = new int[1] ;
      P031Z2_A130BarCodPar = new String[] {""} ;
      P031Z2_A132BarCodReo = new byte[1] ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrloti__default(),
         new Object[] {
             new Object[] {
            P031Z2_A396EmprCod, P031Z2_A129BarCod, P031Z2_A130BarCodPar, P031Z2_A132BarCodReo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Existe_ot ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV8Int_Num ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P031Z2_A396EmprCod ;
   private int[] P031Z2_A129BarCod ;
   private String[] P031Z2_A130BarCodPar ;
   private byte[] P031Z2_A132BarCodReo ;
}

final  class pctrloti__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P031Z2", "SELECT EmprCod, BarCod, BarCodPar, BarCodReo FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

