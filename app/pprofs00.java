package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprofs00 extends GXProcedure
{
   public pprofs00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprofs00.class ), "" );
   }

   public pprofs00( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pprofs00.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pprofs00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprofs00.this.AV8Barcod = aP1[0];
      this.aP1 = aP1;
      pprofs00.this.AV9Barcodreo = aP2[0];
      this.aP2 = aP2;
      pprofs00.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      pprofs00.this.AV11Procod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPBARPRO

      */
      A129BarCod = AV8Barcod ;
      A132BarCodReo = AV9Barcodreo ;
      A130BarCodPar = AV10Barcodpar ;
      A758ProCod = AV11Procod ;
      A761ProFasLin = (short)(0) ;
      n761ProFasLin = false ;
      /* Using cursor P04VG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Boolean.valueOf(n761ProFasLin), Short.valueOf(A761ProFasLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprofs00.this.A396EmprCod;
      this.aP1[0] = pprofs00.this.AV8Barcod;
      this.aP2[0] = pprofs00.this.AV9Barcodreo;
      this.aP3[0] = pprofs00.this.AV10Barcodpar;
      this.aP4[0] = pprofs00.this.AV11Procod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprofs00__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Barcodreo ;
   private byte A132BarCodReo ;
   private short A761ProFasLin ;
   private short Gx_err ;
   private int AV8Barcod ;
   private int GX_INS14 ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV10Barcodpar ;
   private String AV11Procod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String Gx_emsg ;
   private boolean n761ProFasLin ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class pprofs00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P04VG2", "INSERT INTO TXPBARPRO(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, ProFasLin) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               return;
      }
   }

}

