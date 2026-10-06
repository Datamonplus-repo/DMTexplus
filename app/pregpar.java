package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pregpar extends GXProcedure
{
   public pregpar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pregpar.class ), "" );
   }

   public pregpar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 )
   {
      pregpar.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 )
   {
      pregpar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pregpar.this.AV15ContCod = aP1[0];
      this.aP1 = aP1;
      pregpar.this.AV27FecTerm = aP2[0];
      this.aP2 = aP2;
      pregpar.this.AV16Msg_dpkey = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Msg_dpkey = " " ;
      AV17Dpkey1 = " " ;
      AV18i = (byte)(1) ;
      /* Using cursor P006D2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV15ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A313ContCod = P006D2_A313ContCod[0] ;
         A7208ContDsc2 = P006D2_A7208ContDsc2[0] ;
         AV17Dpkey1 = GXutil.substring( A7208ContDsc2, 1, 24) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV17Dpkey1, " ") == 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ! GxRegex.IsMatch(AV17Dpkey1,AV36pattern) )
      {
         AV16Msg_dpkey = httpContext.getMessage( "Clave de firma digital incorrecta - RSA ISALPHA-", "") ;
      }
      if ( GXutil.strcmp(AV16Msg_dpkey, " ") != 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV31Ceros = "0000" ;
      AV18i = (byte)(1) ;
      while ( AV18i <= 23 )
      {
         AV28Val = (byte)(GXutil.lval( GXutil.substring( AV17Dpkey1, AV18i, 1))) ;
         AV29Dig24 = (short)(AV29Dig24+AV28Val) ;
         AV18i = (byte)(AV18i+1) ;
      }
      AV29Dig24 = (short)(AV29Dig24*3) ;
      AV30Dig24A = GXutil.str( AV29Dig24, 4, 0) ;
      AV30Dig24A = GXutil.ltrim( GXutil.rtrim( AV30Dig24A)) ;
      AV32LenVar = (short)(GXutil.len( AV30Dig24A)) ;
      AV32LenVar = (short)(4-AV32LenVar) ;
      AV30Dig24A = GXutil.substring( AV31Ceros, 1, AV32LenVar) + AV30Dig24A ;
      AV33Last24 = (byte)(GXutil.lval( GXutil.substring( AV30Dig24A, 4, 1))) ;
      AV34Dig24dpk = (byte)(GXutil.lval( GXutil.substring( AV17Dpkey1, 24, 1))) ;
      AV20DiaA = GXutil.substring( AV17Dpkey1, 3, 1) + GXutil.substring( AV17Dpkey1, 7, 1) ;
      AV19Dia = (byte)(GXutil.lval( AV20DiaA)) ;
      AV22MesA = GXutil.substring( AV17Dpkey1, 9, 1) + GXutil.substring( AV17Dpkey1, 13, 1) ;
      AV21Mes = (byte)(GXutil.lval( AV22MesA)) ;
      AV24AnyA = GXutil.substring( AV17Dpkey1, 15, 1) + GXutil.substring( AV17Dpkey1, 23, 1) ;
      AV23Any = (byte)(GXutil.lval( AV24AnyA)) ;
      AV26FecFValA = AV20DiaA + "/" + AV22MesA + "/" + AV24AnyA ;
      AV25FecFVal = localUtil.ctod( AV26FecFValA, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      if ( ( (( GXutil.resetTime(AV27FecTerm).after( GXutil.resetTime( AV25FecFVal )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV27FecTerm), GXutil.resetTime(AV25FecFVal)) )) ) || ( ( AV34Dig24dpk != AV33Last24 ) ) )
      {
         AV16Msg_dpkey = httpContext.getMessage( "Clave de firma digital incorrecta", "") ;
         AV18i = (byte)(1) ;
         while ( AV18i <= 24 )
         {
            if ( AV18i == 1 )
            {
               AV35Dpkey2 = GXutil.substring( AV17Dpkey1, AV18i, 1) ;
            }
            else
            {
               if ( AV18i == 5 )
               {
                  AV35Dpkey2 += "9" ;
               }
               else if ( AV18i == 11 )
               {
                  AV35Dpkey2 += "8" ;
               }
               else if ( AV18i == 17 )
               {
                  AV35Dpkey2 += "7" ;
               }
               else
               {
                  AV35Dpkey2 += GXutil.substring( AV17Dpkey1, AV18i, 1) ;
               }
            }
            AV18i = (byte)(AV18i+1) ;
         }
         /* Optimized UPDATE. */
         /* Using cursor P006D3 */
         pr_default.execute(1, new Object[] {AV35Dpkey2, A396EmprCod, AV15ContCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pregpar.this.A396EmprCod;
      this.aP1[0] = pregpar.this.AV15ContCod;
      this.aP2[0] = pregpar.this.AV27FecTerm;
      this.aP3[0] = pregpar.this.AV16Msg_dpkey;
      Application.commitDataStores(context, remoteHandle, pr_default, "pregpar");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17Dpkey1 = "" ;
      scmdbuf = "" ;
      P006D2_A396EmprCod = new String[] {""} ;
      P006D2_A313ContCod = new String[] {""} ;
      P006D2_A7208ContDsc2 = new String[] {""} ;
      A313ContCod = "" ;
      A7208ContDsc2 = "" ;
      AV36pattern = "" ;
      AV31Ceros = "" ;
      AV30Dig24A = "" ;
      AV20DiaA = "" ;
      AV22MesA = "" ;
      AV24AnyA = "" ;
      AV26FecFValA = "" ;
      AV25FecFVal = GXutil.nullDate() ;
      AV35Dpkey2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pregpar__default(),
         new Object[] {
             new Object[] {
            P006D2_A396EmprCod, P006D2_A313ContCod, P006D2_A7208ContDsc2
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18i ;
   private byte AV28Val ;
   private byte AV33Last24 ;
   private byte AV34Dig24dpk ;
   private byte AV19Dia ;
   private byte AV21Mes ;
   private byte AV23Any ;
   private short AV29Dig24 ;
   private short AV32LenVar ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV15ContCod ;
   private String AV16Msg_dpkey ;
   private String AV17Dpkey1 ;
   private String scmdbuf ;
   private String A313ContCod ;
   private String A7208ContDsc2 ;
   private String AV31Ceros ;
   private String AV30Dig24A ;
   private String AV20DiaA ;
   private String AV22MesA ;
   private String AV24AnyA ;
   private String AV26FecFValA ;
   private String AV35Dpkey2 ;
   private java.util.Date AV27FecTerm ;
   private java.util.Date AV25FecFVal ;
   private boolean returnInSub ;
   private String AV36pattern ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P006D2_A396EmprCod ;
   private String[] P006D2_A313ContCod ;
   private String[] P006D2_A7208ContDsc2 ;
}

final  class pregpar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006D2", "SELECT EmprCod, ContCod, ContDsc2 FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P006D3", "UPDATE TXPEMPLIN SET ContDsc2=?  WHERE EmprCod = ? and ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 100);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

