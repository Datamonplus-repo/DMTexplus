package app.albaranescomerciales ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranescomerciales.edicionalbaranescomerciales", "/app.albaranescomerciales.edicionalbaranescomerciales"})
@jakarta.servlet.annotation.MultipartConfig
public final  class edicionalbaranescomerciales extends GXWebObjectStub
{
   public edicionalbaranescomerciales( )
   {
   }

   public edicionalbaranescomerciales( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( edicionalbaranescomerciales.class ));
   }

   public edicionalbaranescomerciales( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new edicionalbaranescomerciales_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new edicionalbaranescomerciales_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Edicion Albaranes  Comerciales";
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

