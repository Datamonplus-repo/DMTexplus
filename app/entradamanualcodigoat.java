package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entradamanualcodigoat", "/app.entradamanualcodigoat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradamanualcodigoat extends GXWebObjectStub
{
   public entradamanualcodigoat( )
   {
   }

   public entradamanualcodigoat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradamanualcodigoat.class ));
   }

   public entradamanualcodigoat( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradamanualcodigoat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradamanualcodigoat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Manual Codigo AT";
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

