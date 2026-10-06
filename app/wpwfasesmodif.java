package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wpwfasesmodif", "/app.wpwfasesmodif"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wpwfasesmodif extends GXWebObjectStub
{
   public wpwfasesmodif( )
   {
   }

   public wpwfasesmodif( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wpwfasesmodif.class ));
   }

   public wpwfasesmodif( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wpwfasesmodif_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wpwfasesmodif_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modificacion datos Fases";
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

