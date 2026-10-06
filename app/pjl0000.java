package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pjl0000 extends GXProcedure
{
   public pjl0000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pjl0000.class ), "" );
   }

   public pjl0000( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pjl0000.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pjl0000.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pjl0000.this.AV15MacCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV21PrintAcc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IMPACC", ""), GXv_int2) ;
      pjl0000.this.GXt_int1 = GXv_int2[0] ;
      AV21PrintAcc = GXt_int1 ;
      GXv_int2[0] = AV17FlagTin ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int2) ;
      pjl0000.this.AV17FlagTin = GXv_int2[0] ;
      AV16HayAgrp = (byte)(0) ;
      AV26BarAgr = (byte)(0) ;
      AV24Imp_p = (byte)(0) ;
      AV27HdrnoA = (byte)(0) ;
      /* Using cursor P00UQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15MacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1205MacBarPar = P00UQ2_A1205MacBarPar[0] ;
         A1204MacBarReo = P00UQ2_A1204MacBarReo[0] ;
         A1203MacBarCod = P00UQ2_A1203MacBarCod[0] ;
         A1199MacCod = P00UQ2_A1199MacCod[0] ;
         A1201MacLin = P00UQ2_A1201MacLin[0] ;
         /* Using cursor P00UQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1203MacBarCod), Byte.valueOf(A1204MacBarReo), A1205MacBarPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A129BarCod = P00UQ3_A129BarCod[0] ;
            A132BarCodReo = P00UQ3_A132BarCodReo[0] ;
            A130BarCodPar = P00UQ3_A130BarCodPar[0] ;
            A120BarAgrEst = P00UQ3_A120BarAgrEst[0] ;
            AV18BarCod = A129BarCod ;
            AV19BarCodReo = A132BarCodReo ;
            AV20BarCodPar = A130BarCodPar ;
            AV16HayAgrp = (byte)(0) ;
            if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
            {
               GXv_char3[0] = A396EmprCod ;
               GXv_int4[0] = AV18BarCod ;
               GXv_int2[0] = AV19BarCodReo ;
               GXv_char5[0] = AV20BarCodPar ;
               GXv_int6[0] = AV16HayAgrp ;
               new app.pctrhdra(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int2, GXv_char5, GXv_int6) ;
               pjl0000.this.A396EmprCod = GXv_char3[0] ;
               pjl0000.this.AV18BarCod = GXv_int4[0] ;
               pjl0000.this.AV19BarCodReo = GXv_int2[0] ;
               pjl0000.this.AV20BarCodPar = GXv_char5[0] ;
               pjl0000.this.AV16HayAgrp = GXv_int6[0] ;
            }
            AV22Msg_1 = "" ;
            if ( AV16HayAgrp == 1 )
            {
               AV22Msg_1 = httpContext.getMessage( "Esta OS ya esta marcada como agrupada, BarAgrEst = ", "") + A120BarAgrEst ;
               AV26BarAgr = (byte)(1) ;
            }
            else
            {
               AV22Msg_1 = httpContext.getMessage( "Esta OS NO esta Agrupada, BarAgrEst = ", "") + A120BarAgrEst ;
               AV27HdrnoA = (byte)(1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV27HdrnoA == 1 )
      {
         AV22Msg_1 = httpContext.getMessage( "El sistema ha detectado que ya existe AGRUPACION de OS. La(s) OS(s) introducidas", "") ;
         AV23Msg_2 = httpContext.getMessage( "como accesorio(s) nuevo(s) se tendra(n) que agrupar de forma MANUAL", "") ;
      }
      if ( ! (0==AV15MacCod) )
      {
         System.out.println( httpContext.getMessage( "Inicio creacion tabla de Agrupaciones f(Accesorios)", "") );
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = AV15MacCod ;
         new app.pagrmac(remoteHandle, context).execute( GXv_char5, GXv_int4) ;
         pjl0000.this.A396EmprCod = GXv_char5[0] ;
         pjl0000.this.AV15MacCod = GXv_int4[0] ;
         if ( AV17FlagTin == 1 )
         {
            new app.putil22(remoteHandle, context).execute( ) ;
         }
         System.out.println( httpContext.getMessage( "Fin creacion tabla de Agrupaciones f(Accesorios)", "") );
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pjl0000.this.A396EmprCod;
      this.aP1[0] = pjl0000.this.AV15MacCod;
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
      P00UQ2_A396EmprCod = new String[] {""} ;
      P00UQ2_A1205MacBarPar = new String[] {""} ;
      P00UQ2_A1204MacBarReo = new byte[1] ;
      P00UQ2_A1203MacBarCod = new int[1] ;
      P00UQ2_A1199MacCod = new int[1] ;
      P00UQ2_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      P00UQ3_A396EmprCod = new String[] {""} ;
      P00UQ3_A129BarCod = new int[1] ;
      P00UQ3_A132BarCodReo = new byte[1] ;
      P00UQ3_A130BarCodPar = new String[] {""} ;
      P00UQ3_A120BarAgrEst = new String[] {""} ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      AV20BarCodPar = "" ;
      GXv_char3 = new String[1] ;
      GXv_int2 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      AV22Msg_1 = "" ;
      AV23Msg_2 = "" ;
      GXv_char5 = new String[1] ;
      GXv_int4 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pjl0000__default(),
         new Object[] {
             new Object[] {
            P00UQ2_A396EmprCod, P00UQ2_A1205MacBarPar, P00UQ2_A1204MacBarReo, P00UQ2_A1203MacBarCod, P00UQ2_A1199MacCod, P00UQ2_A1201MacLin
            }
            , new Object[] {
            P00UQ3_A396EmprCod, P00UQ3_A129BarCod, P00UQ3_A132BarCodReo, P00UQ3_A130BarCodPar, P00UQ3_A120BarAgrEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21PrintAcc ;
   private byte GXt_int1 ;
   private byte AV17FlagTin ;
   private byte AV16HayAgrp ;
   private byte AV26BarAgr ;
   private byte AV24Imp_p ;
   private byte AV27HdrnoA ;
   private byte A1204MacBarReo ;
   private byte A132BarCodReo ;
   private byte AV19BarCodReo ;
   private byte GXv_int2[] ;
   private byte GXv_int6[] ;
   private short A1201MacLin ;
   private short Gx_err ;
   private int AV15MacCod ;
   private int A1203MacBarCod ;
   private int A1199MacCod ;
   private int A129BarCod ;
   private int AV18BarCod ;
   private int GXv_int4[] ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A1205MacBarPar ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String AV20BarCodPar ;
   private String GXv_char3[] ;
   private String AV22Msg_1 ;
   private String AV23Msg_2 ;
   private String GXv_char5[] ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00UQ2_A396EmprCod ;
   private String[] P00UQ2_A1205MacBarPar ;
   private byte[] P00UQ2_A1204MacBarReo ;
   private int[] P00UQ2_A1203MacBarCod ;
   private int[] P00UQ2_A1199MacCod ;
   private short[] P00UQ2_A1201MacLin ;
   private String[] P00UQ3_A396EmprCod ;
   private int[] P00UQ3_A129BarCod ;
   private byte[] P00UQ3_A132BarCodReo ;
   private String[] P00UQ3_A130BarCodPar ;
   private String[] P00UQ3_A120BarAgrEst ;
}

final  class pjl0000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00UQ2", "SELECT EmprCod, MacBarPar, MacBarReo, MacBarCod, MacCod, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod, MacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00UQ3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

