package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcconsultadocumentoscomercialesdetalle", "/app.wcconsultadocumentoscomercialesdetalle"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcconsultadocumentoscomercialesdetalle extends GXWebObjectStub
{
   public wcconsultadocumentoscomercialesdetalle( )
   {
   }

   public wcconsultadocumentoscomercialesdetalle( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcconsultadocumentoscomercialesdetalle.class ));
   }

   public wcconsultadocumentoscomercialesdetalle( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcconsultadocumentoscomercialesdetalle_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcconsultadocumentoscomercialesdetalle_impl(context).cleanup();
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

