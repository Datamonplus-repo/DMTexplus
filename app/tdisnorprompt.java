package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdisnorprompt", "/app.tdisnorprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdisnorprompt extends GXWebObjectStub
{
   public tdisnorprompt( )
   {
   }

   public tdisnorprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdisnorprompt.class ));
   }

   public tdisnorprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdisnorprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdisnorprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Normas";
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

