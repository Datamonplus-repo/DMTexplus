package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcconsultadocumentoscomerciales", "/app.wcconsultadocumentoscomerciales"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcconsultadocumentoscomerciales extends GXWebObjectStub
{
   public wcconsultadocumentoscomerciales( )
   {
   }

   public wcconsultadocumentoscomerciales( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcconsultadocumentoscomerciales.class ));
   }

   public wcconsultadocumentoscomerciales( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcconsultadocumentoscomerciales_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcconsultadocumentoscomerciales_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Documento Comercial (v01)";
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

