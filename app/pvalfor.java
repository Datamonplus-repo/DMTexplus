package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvalfor extends GXProcedure
{
   public pvalfor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvalfor.class ), "" );
   }

   public pvalfor( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           java.math.BigDecimal[] aP1 ,
                           short[] aP2 ,
                           int[] aP3 ,
                           java.math.BigDecimal[] aP4 ,
                           java.math.BigDecimal[] aP5 )
   {
      pvalfor.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        java.math.BigDecimal[] aP1 ,
                        short[] aP2 ,
                        int[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             java.math.BigDecimal[] aP1 ,
                             short[] aP2 ,
                             int[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             byte[] aP6 )
   {
      pvalfor.this.AV16Formula = aP0[0];
      this.aP0 = aP0;
      pvalfor.this.AV26Corante = aP1[0];
      this.aP1 = aP1;
      pvalfor.this.AV25RBanho = aP2[0];
      this.aP2 = aP2;
      pvalfor.this.AV24Volume = aP3[0];
      this.aP3 = aP3;
      pvalfor.this.AV27Kilos = aP4[0];
      this.aP4 = aP4;
      pvalfor.this.AV23Valor = aP5[0];
      this.aP5 = aP5;
      pvalfor.this.AV14Flag = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Flag = (byte)(0) ;
      GXv_char1[0] = AV16Formula ;
      GXv_char2[0] = AV28ForClaFor ;
      GXv_int3[0] = AV14Flag ;
      new app.ppesfor(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      pvalfor.this.AV16Formula = GXv_char1[0] ;
      pvalfor.this.AV28ForClaFor = GXv_char2[0] ;
      pvalfor.this.AV14Flag = GXv_int3[0] ;
      if ( AV14Flag == 0 )
      {
         Gx_msg = httpContext.getMessage( " A Formula ( ", "") + AV16Formula + httpContext.getMessage( " ) não existe", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV22Tamanho = (short)(GXutil.len( AV28ForClaFor)) ;
      AV17i = (short)(0) ;
      AV18NumParc = DecimalUtil.doubleToDec(0) ;
      AV19Parcela = "" ;
      AV21Sinal = " " ;
      AV23Valor = DecimalUtil.doubleToDec(0) ;
      while ( AV17i <= AV22Tamanho )
      {
         AV15caract = GXutil.substring( AV28ForClaFor, AV17i, 1) ;
         if ( ( ( GXutil.strcmp(AV15caract, "0") >= 0 ) && ( GXutil.strcmp(AV15caract, "9") <= 0 ) ) || ( GXutil.strcmp(AV15caract, ".") == 0 ) )
         {
            AV19Parcela += AV15caract ;
         }
         if ( ( GXutil.strcmp(AV15caract, "*") == 0 ) || ( GXutil.strcmp(AV15caract, "+") == 0 ) || ( GXutil.strcmp(AV15caract, "-") == 0 ) || ( GXutil.strcmp(AV15caract, "/") == 0 ) )
         {
            if ( GXutil.strcmp(AV19Parcela, "") != 0 )
            {
               /* Execute user subroutine: 'CALCULAVALOR' */
               S111 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV19Parcela = "" ;
               AV21Sinal = AV15caract ;
            }
            else
            {
               AV21Sinal = AV15caract ;
            }
         }
         if ( ( GXutil.strcmp(AV15caract, httpContext.getMessage( "C", "")) == 0 ) || ( GXutil.strcmp(AV15caract, httpContext.getMessage( "R", "")) == 0 ) || ( GXutil.strcmp(AV15caract, httpContext.getMessage( "V", "")) == 0 ) || ( GXutil.strcmp(AV15caract, httpContext.getMessage( "K", "")) == 0 ) )
         {
            if ( GXutil.strcmp(AV15caract, httpContext.getMessage( "C", "")) == 0 )
            {
               AV18NumParc = AV26Corante ;
            }
            else
            {
               if ( GXutil.strcmp(AV15caract, httpContext.getMessage( "R", "")) == 0 )
               {
                  AV18NumParc = DecimalUtil.doubleToDec(AV25RBanho) ;
               }
               else
               {
                  if ( GXutil.strcmp(AV15caract, httpContext.getMessage( "V", "")) == 0 )
                  {
                     AV18NumParc = DecimalUtil.doubleToDec(AV24Volume) ;
                  }
                  else
                  {
                     if ( GXutil.strcmp(AV15caract, httpContext.getMessage( "K", "")) == 0 )
                     {
                        AV18NumParc = AV27Kilos ;
                     }
                  }
               }
            }
            /* Execute user subroutine: 'CALCULAVALOR' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV19Parcela = "" ;
         }
         AV17i = (short)(AV17i+1) ;
      }
      if ( GXutil.strcmp(AV19Parcela, "") != 0 )
      {
         /* Execute user subroutine: 'CALCULAVALOR' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CALCULAVALOR' Routine */
      returnInSub = false ;
      if ( AV18NumParc.doubleValue() == 0 )
      {
         AV18NumParc = CommonUtil.decimalVal( AV19Parcela, ".") ;
      }
      if ( GXutil.strcmp(AV21Sinal, " ") == 0 )
      {
         AV23Valor = AV18NumParc ;
      }
      else
      {
         if ( GXutil.strcmp(AV21Sinal, "*") == 0 )
         {
            AV23Valor = AV23Valor.multiply(AV18NumParc) ;
         }
         else
         {
            if ( GXutil.strcmp(AV21Sinal, "+") == 0 )
            {
               AV23Valor = AV23Valor.add(AV18NumParc) ;
            }
            else
            {
               if ( GXutil.strcmp(AV21Sinal, "-") == 0 )
               {
                  AV23Valor = AV23Valor.subtract(AV18NumParc) ;
               }
               else
               {
                  if ( GXutil.strcmp(AV21Sinal, "/") == 0 )
                  {
                     AV23Valor = AV23Valor.divide(AV18NumParc, 18, java.math.RoundingMode.DOWN) ;
                  }
               }
            }
         }
      }
      AV18NumParc = DecimalUtil.doubleToDec(0) ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvalfor.this.AV16Formula;
      this.aP1[0] = pvalfor.this.AV26Corante;
      this.aP2[0] = pvalfor.this.AV25RBanho;
      this.aP3[0] = pvalfor.this.AV24Volume;
      this.aP4[0] = pvalfor.this.AV27Kilos;
      this.aP5[0] = pvalfor.this.AV23Valor;
      this.aP6[0] = pvalfor.this.AV14Flag;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String[1] ;
      AV28ForClaFor = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new byte[1] ;
      Gx_msg = "" ;
      AV18NumParc = DecimalUtil.ZERO ;
      AV19Parcela = "" ;
      AV21Sinal = "" ;
      AV15caract = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14Flag ;
   private byte GXv_int3[] ;
   private short AV25RBanho ;
   private short AV22Tamanho ;
   private short AV17i ;
   private short Gx_err ;
   private int AV24Volume ;
   private java.math.BigDecimal AV26Corante ;
   private java.math.BigDecimal AV27Kilos ;
   private java.math.BigDecimal AV23Valor ;
   private java.math.BigDecimal AV18NumParc ;
   private String AV16Formula ;
   private String GXv_char1[] ;
   private String AV28ForClaFor ;
   private String GXv_char2[] ;
   private String Gx_msg ;
   private String AV19Parcela ;
   private String AV21Sinal ;
   private String AV15caract ;
   private boolean returnInSub ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private java.math.BigDecimal[] aP1 ;
   private short[] aP2 ;
   private int[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
}

