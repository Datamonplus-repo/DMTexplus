package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdoctrndocumentocomercialv02", "/app.tdoctrndocumentocomercialv02"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdoctrndocumentocomercialv02 extends GXWebObjectStub
{
   public tdoctrndocumentocomercialv02( )
   {
   }

   public tdoctrndocumentocomercialv02( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdoctrndocumentocomercialv02.class ));
   }

   public tdoctrndocumentocomercialv02( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdoctrndocumentocomercialv02_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdoctrndocumentocomercialv02_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDOCTRNDocumento Comercialv02";
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

