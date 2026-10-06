package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccionanalisistradicional", "/app.produccionanalisistradicional"})
@jakarta.servlet.annotation.MultipartConfig
public final  class produccionanalisistradicional extends GXWebObjectStub
{
   public produccionanalisistradicional( )
   {
   }

   public produccionanalisistradicional( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( produccionanalisistradicional.class ));
   }

   public produccionanalisistradicional( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new produccionanalisistradicional_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new produccionanalisistradicional_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Produccion Analisis Tradicional";
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

