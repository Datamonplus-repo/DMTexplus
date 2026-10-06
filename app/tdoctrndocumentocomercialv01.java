package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdoctrndocumentocomercialv01", "/app.tdoctrndocumentocomercialv01"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdoctrndocumentocomercialv01 extends GXWebObjectStub
{
   public tdoctrndocumentocomercialv01( )
   {
   }

   public tdoctrndocumentocomercialv01( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdoctrndocumentocomercialv01.class ));
   }

   public tdoctrndocumentocomercialv01( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdoctrndocumentocomercialv01_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdoctrndocumentocomercialv01_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDOCTRNDocumento Comercialv01";
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

