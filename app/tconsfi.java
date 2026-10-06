package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tconsfi", "/app.tconsfi"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tconsfi extends GXWebObjectStub
{
   public tconsfi( )
   {
   }

   public tconsfi( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tconsfi.class ));
   }

   public tconsfi( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tconsfi_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tconsfi_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CONSUMOS POR FIBRAS";
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

