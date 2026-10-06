package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdisnor", "/app.tdisnor"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdisnor extends GXWebObjectStub
{
   public tdisnor( )
   {
   }

   public tdisnor( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdisnor.class ));
   }

   public tdisnor( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdisnor_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdisnor_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Normas";
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

