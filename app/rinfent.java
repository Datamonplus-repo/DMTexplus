package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rinfent", "/app.rinfent"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rinfent extends GXWebObjectStub
{
   public rinfent( )
   {
   }

   public rinfent( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rinfent.class ));
   }

   public rinfent( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rinfent_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rinfent_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "INFORME ENTRADAS COMPRAS";
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

