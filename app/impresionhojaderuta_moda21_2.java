package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.impresionhojaderuta_moda21_2", "/app.impresionhojaderuta_moda21_2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class impresionhojaderuta_moda21_2 extends GXWebObjectStub
{
   public impresionhojaderuta_moda21_2( )
   {
   }

   public impresionhojaderuta_moda21_2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( impresionhojaderuta_moda21_2.class ));
   }

   public impresionhojaderuta_moda21_2( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new impresionhojaderuta_moda21_2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new impresionhojaderuta_moda21_2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Impressão da Ordem de Serviço";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

