package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcconsultaalmacentejidoencrudo", "/app.wcconsultaalmacentejidoencrudo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcconsultaalmacentejidoencrudo extends GXWebObjectStub
{
   public wcconsultaalmacentejidoencrudo( )
   {
   }

   public wcconsultaalmacentejidoencrudo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcconsultaalmacentejidoencrudo.class ));
   }

   public wcconsultaalmacentejidoencrudo( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcconsultaalmacentejidoencrudo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcconsultaalmacentejidoencrudo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Entrada Tejido Crudo Almacen";
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

