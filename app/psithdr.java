package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psithdr extends GXProcedure
{
   public psithdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psithdr.class ), "" );
   }

   public psithdr( int remoteHandle ,
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
      psithdr.this.aP4 = new String[] {""};
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
      psithdr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psithdr.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      psithdr.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      psithdr.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      psithdr.this.AV8Msg1 = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Msg1 = "" ;
      /* Using cursor P040V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A120BarAgrEst = P040V2_A120BarAgrEst[0] ;
         A213BarSit = P040V2_A213BarSit[0] ;
         AV9Barcod = A129BarCod ;
         AV10Barcodreo = A132BarCodReo ;
         AV11Barcodpar = A130BarCodPar ;
         AV13BarAGrest = A120BarAgrEst ;
         AV14Barcodp = A129BarCod ;
         AV15Barcodreop = A132BarCodReo ;
         AV16Barcodparp = A130BarCodPar ;
         if ( A213BarSit == 4 )
         {
            if ( GXutil.strcmp(AV13BarAGrest, httpContext.getMessage( "S", "")) == 0 )
            {
               new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV14Barcodp, AV15Barcodreop, AV16Barcodparp) ;
            }
            /* Execute user subroutine: 'RECMAQ' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV8Msg1 = httpContext.getMessage( "La situacion de esta HDR es ", "") + GXutil.str( A213BarSit, 2, 0) + GXutil.chr( (short)(13)) ;
            if ( AV12Recmaqt == 1 )
            {
               AV8Msg1 += httpContext.getMessage( "Receta de Tinte Creada", "") + GXutil.chr( (short)(13)) ;
            }
            else
            {
               AV8Msg1 += httpContext.getMessage( "pero ...NO hay Receta Tinte Creada ¡¡¡", "") + GXutil.chr( (short)(13)) ;
            }
         }
         else
         {
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV8Msg1, "") != 0 )
      {
         httpContext.GX_msglist.addItem(AV8Msg1);
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'RECMAQ' Routine */
      returnInSub = false ;
      AV12Recmaqt = (byte)(0) ;
      /* Using cursor P040V3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV14Barcodp), Byte.valueOf(AV15Barcodreop), AV16Barcodparp});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A6039RecAcab = P040V3_A6039RecAcab[0] ;
         n6039RecAcab = P040V3_n6039RecAcab[0] ;
         A2804RecLinMaq = P040V3_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "N", "")) == 0 )
         {
            AV12Recmaqt = (byte)(1) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = psithdr.this.A396EmprCod;
      this.aP1[0] = psithdr.this.A129BarCod;
      this.aP2[0] = psithdr.this.A132BarCodReo;
      this.aP3[0] = psithdr.this.A130BarCodPar;
      this.aP4[0] = psithdr.this.AV8Msg1;
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
      P040V2_A396EmprCod = new String[] {""} ;
      P040V2_A129BarCod = new int[1] ;
      P040V2_A132BarCodReo = new byte[1] ;
      P040V2_A130BarCodPar = new String[] {""} ;
      P040V2_A120BarAgrEst = new String[] {""} ;
      P040V2_A213BarSit = new byte[1] ;
      A120BarAgrEst = "" ;
      AV11Barcodpar = "" ;
      AV13BarAGrest = "" ;
      AV16Barcodparp = "" ;
      P040V3_A396EmprCod = new String[] {""} ;
      P040V3_A6039RecAcab = new String[] {""} ;
      P040V3_n6039RecAcab = new boolean[] {false} ;
      P040V3_A130BarCodPar = new String[] {""} ;
      P040V3_A132BarCodReo = new byte[1] ;
      P040V3_A129BarCod = new int[1] ;
      P040V3_A2804RecLinMaq = new short[1] ;
      A6039RecAcab = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psithdr__default(),
         new Object[] {
             new Object[] {
            P040V2_A396EmprCod, P040V2_A129BarCod, P040V2_A132BarCodReo, P040V2_A130BarCodPar, P040V2_A120BarAgrEst, P040V2_A213BarSit
            }
            , new Object[] {
            P040V3_A396EmprCod, P040V3_A6039RecAcab, P040V3_n6039RecAcab, P040V3_A130BarCodPar, P040V3_A132BarCodReo, P040V3_A129BarCod, P040V3_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV10Barcodreo ;
   private byte AV15Barcodreop ;
   private byte AV12Recmaqt ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9Barcod ;
   private int AV14Barcodp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8Msg1 ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String AV11Barcodpar ;
   private String AV13BarAGrest ;
   private String AV16Barcodparp ;
   private String A6039RecAcab ;
   private boolean returnInSub ;
   private boolean n6039RecAcab ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P040V2_A396EmprCod ;
   private int[] P040V2_A129BarCod ;
   private byte[] P040V2_A132BarCodReo ;
   private String[] P040V2_A130BarCodPar ;
   private String[] P040V2_A120BarAgrEst ;
   private byte[] P040V2_A213BarSit ;
   private String[] P040V3_A396EmprCod ;
   private String[] P040V3_A6039RecAcab ;
   private boolean[] P040V3_n6039RecAcab ;
   private String[] P040V3_A130BarCodPar ;
   private byte[] P040V3_A132BarCodReo ;
   private int[] P040V3_A129BarCod ;
   private short[] P040V3_A2804RecLinMaq ;
}

final  class psithdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P040V2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P040V3", "SELECT EmprCod, RecAcab, BarCodPar, BarCodReo, BarCod, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

