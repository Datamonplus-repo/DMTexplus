package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pincctr extends GXProcedure
{
   public pincctr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pincctr.class ), "" );
   }

   public pincctr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 )
   {
      pincctr.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 )
   {
      pincctr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pincctr.this.AV13Pgmname_i = aP1[0];
      this.aP1 = aP1;
      pincctr.this.AV8Usurcod = aP2[0];
      this.aP2 = aP2;
      pincctr.this.AV9Station = aP3[0];
      this.aP3 = aP3;
      pincctr.this.AV14Texto_i = aP4[0];
      this.aP4 = aP4;
      pincctr.this.AV15BarCod = aP5[0];
      this.aP5 = aP5;
      pincctr.this.AV16BarCodReo = aP6[0];
      this.aP6 = aP6;
      pincctr.this.AV17BarCodPar = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Inc_Ult = 0 ;
      AV12Dia_i = GXutil.serverDate( context, remoteHandle, pr_default) ;
      /*
         INSERT RECORD ON TABLE TXPCRTINC

      */
      A4929Inc_Dia = AV12Dia_i ;
      A4930Inc_Num_ul = 0 ;
      n4930Inc_Num_ul = false ;
      /* Using cursor P04GC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A4929Inc_Dia, Boolean.valueOf(n4930Inc_Num_ul), Long.valueOf(A4930Inc_Num_ul)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTINC");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P04GC3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A4929Inc_Dia});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A396EmprCod = P04GC3_A396EmprCod[0] ;
            A4929Inc_Dia = P04GC3_A4929Inc_Dia[0] ;
            A4930Inc_Num_ul = P04GC3_A4930Inc_Num_ul[0] ;
            n4930Inc_Num_ul = P04GC3_n4930Inc_Num_ul[0] ;
            AV10Inc_Ult = A4930Inc_Num_ul ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPCRTIN1

      */
      A4929Inc_Dia = AV12Dia_i ;
      A4931Inc_Linea = (long)(AV10Inc_Ult+1) ;
      A4932Inc_Hora = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      A4933Inc_Usuari = AV8Usurcod ;
      A4934Inc_Termin = AV9Station ;
      A4935Inc_Prog = AV13Pgmname_i ;
      A4936Inc_Obs = AV14Texto_i + GXutil.newLine( ) ;
      A5299Inc_Barcod = AV15BarCod ;
      A5301Inc_BarPar = AV17BarCodPar ;
      A5300Inc_BarReo = AV16BarCodReo ;
      /* Using cursor P04GC4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea), A4932Inc_Hora, A4933Inc_Usuari, A4934Inc_Termin, A4935Inc_Prog, A4936Inc_Obs, Integer.valueOf(A5299Inc_Barcod), Byte.valueOf(A5300Inc_BarReo), A5301Inc_BarPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTIN1");
      if ( (pr_default.getStatus(2) == 1) )
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
      n4930Inc_Num_ul = false ;
      /* Optimized UPDATE. */
      /* Using cursor P04GC5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV12Dia_i});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTINC");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pincctr.this.A396EmprCod;
      this.aP1[0] = pincctr.this.AV13Pgmname_i;
      this.aP2[0] = pincctr.this.AV8Usurcod;
      this.aP3[0] = pincctr.this.AV9Station;
      this.aP4[0] = pincctr.this.AV14Texto_i;
      this.aP5[0] = pincctr.this.AV15BarCod;
      this.aP6[0] = pincctr.this.AV16BarCodReo;
      this.aP7[0] = pincctr.this.AV17BarCodPar;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Dia_i = GXutil.nullDate() ;
      A4929Inc_Dia = GXutil.nullDate() ;
      Gx_emsg = "" ;
      scmdbuf = "" ;
      P04GC3_A396EmprCod = new String[] {""} ;
      P04GC3_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P04GC3_A4930Inc_Num_ul = new long[1] ;
      P04GC3_n4930Inc_Num_ul = new boolean[] {false} ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      A4933Inc_Usuari = "" ;
      A4934Inc_Termin = "" ;
      A4935Inc_Prog = "" ;
      A4936Inc_Obs = "" ;
      A5301Inc_BarPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pincctr__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P04GC3_A396EmprCod, P04GC3_A4929Inc_Dia, P04GC3_A4930Inc_Num_ul, P04GC3_n4930Inc_Num_ul
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte A5300Inc_BarReo ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int GX_INS725 ;
   private int GX_INS726 ;
   private int A5299Inc_Barcod ;
   private long AV10Inc_Ult ;
   private long A4930Inc_Num_ul ;
   private long A4931Inc_Linea ;
   private String A396EmprCod ;
   private String AV13Pgmname_i ;
   private String AV8Usurcod ;
   private String AV9Station ;
   private String AV17BarCodPar ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private String A4933Inc_Usuari ;
   private String A4934Inc_Termin ;
   private String A4935Inc_Prog ;
   private String A5301Inc_BarPar ;
   private java.util.Date A4932Inc_Hora ;
   private java.util.Date AV12Dia_i ;
   private java.util.Date A4929Inc_Dia ;
   private boolean n4930Inc_Num_ul ;
   private String AV14Texto_i ;
   private String A4936Inc_Obs ;
   private String[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P04GC3_A396EmprCod ;
   private java.util.Date[] P04GC3_A4929Inc_Dia ;
   private long[] P04GC3_A4930Inc_Num_ul ;
   private boolean[] P04GC3_n4930Inc_Num_ul ;
}

final  class pincctr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P04GC2", "INSERT INTO TXPCRTINC(EmprCod, Inc_Dia, Inc_Num_ul) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRTINC")
         ,new ForEachCursor("P04GC3", "SELECT EmprCod, Inc_Dia, Inc_Num_ul FROM TXPCRTINC WHERE EmprCod = ? and Inc_Dia = ? ORDER BY EmprCod, Inc_Dia ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04GC4", "INSERT INTO TXPCRTIN1(EmprCod, Inc_Dia, Inc_Linea, Inc_Hora, Inc_Usuari, Inc_Termin, Inc_Prog, Inc_Obs, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Maqcod, Inc_St) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRTIN1")
         ,new UpdateCursor("P04GC5", "UPDATE TXPCRTINC SET Inc_Num_ul=Inc_Num_ul + 1  WHERE EmprCod = ? and Inc_Dia = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRTINC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(3, ((Number) parms[3]).longValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setDateTime(4, (java.util.Date)parms[3], true);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 10);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setVarchar(8, (String)parms[7], 400, false);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
      }
   }

}

