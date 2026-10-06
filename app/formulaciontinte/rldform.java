package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.rldform", "/app.formulaciontinte.rldform"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rldform extends GXWebObjectStub
{
   public rldform( )
   {
   }

   public rldform( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rldform.class ));
   }

   public rldform( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rldform_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rldform_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado de Formulas con Claves";
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

