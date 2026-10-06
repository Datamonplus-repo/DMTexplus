package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfasesmodif", "/app.tfasesmodif"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfasesmodif extends GXWebObjectStub
{
   public tfasesmodif( )
   {
   }

   public tfasesmodif( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfasesmodif.class ));
   }

   public tfasesmodif( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfasesmodif_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfasesmodif_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FASESModif";
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

