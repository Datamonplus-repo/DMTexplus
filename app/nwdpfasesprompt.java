package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpfasesprompt", "/app.nwdpfasesprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpfasesprompt extends GXWebObjectStub
{
   public nwdpfasesprompt( )
   {
   }

   public nwdpfasesprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpfasesprompt.class ));
   }

   public nwdpfasesprompt( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpfasesprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpfasesprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Nw DPFases";
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

